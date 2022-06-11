package interface1.model.service;

import interface1.model.entities.AluguelCarro;
import interface1.model.entities.Fatura;

public class AluguelService {

  private Double precoPorDia;
  private Double precoPorHora;
  private ImpostoService impostoService;

  public AluguelService(Double precoPorDia, Double precoPorHora,
                        ImpostoService impostoService) {
    this.precoPorDia = precoPorDia;
    this.precoPorHora = precoPorHora;
    this.impostoService = impostoService;
  }

  public void fatura(AluguelCarro aluguelCarro) {
    long t1 = aluguelCarro.getInicio().getTime();
    long t2 = aluguelCarro.getFim().getTime();
    double horas = (double) (t2 - t1) / 1000 / 60 / 60;

    double pagamentoBasico;
    if (horas <= 12.0) {
      pagamentoBasico = precoPorHora * Math.ceil(horas);
    } else {
      pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
    }

    double imposto = impostoService.imposto(pagamentoBasico);

    aluguelCarro.setFatura(new Fatura(pagamentoBasico, imposto));
  }

}
