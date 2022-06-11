package interface4.services;

public class PaypalService
  implements PagamentoOnlineService {

  private static final double TAXA_PORCENTAGEM = 0.02;
  private static final double JUROS_MENSAIS = 0.01;

  @Override
  public double taxaPagamento(double quantia) {
    return quantia * TAXA_PORCENTAGEM;
  }

  @Override
  public double interesse(double quantia, int meses) {
    return quantia * JUROS_MENSAIS * meses;
  }

}
