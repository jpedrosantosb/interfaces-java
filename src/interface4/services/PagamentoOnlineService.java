package interface4.services;

public interface PagamentoOnlineService {

  double taxaPagamento(double quantia);
  double interesse(double quantia, int meses);
  
}
