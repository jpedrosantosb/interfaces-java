package interface4.services;

import java.util.Calendar;
import java.util.Date;

import interface4.entities.Contrato;
import interface4.entities.Parcelamento;

public class ContratoService {

  private PagamentoOnlineService pagamentoOnlineService;
  
  
  
  public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
    this.pagamentoOnlineService = pagamentoOnlineService;
  }

  public void processContrato(Contrato contrato, int meses) {
      double cotaBasica = contrato.getValorTotal() / meses;
      for (int i = 1; i <= meses; i++) {
          Date data = addMeses(contrato.getData(), i);
          double atualizaCota = cotaBasica + pagamentoOnlineService.interesse(cotaBasica, i);
          double cotaCompleta =  atualizaCota + pagamentoOnlineService.taxaPagamento(atualizaCota);
          contrato.addParcelamento(new Parcelamento(data, cotaCompleta));
      }
  }
  
  private Date addMeses(Date data, int i) {
      Calendar cal = Calendar.getInstance();
      cal.setTime(data);
      cal.add(Calendar.MONTH, i);
      return cal.getTime();
  }
  
}
