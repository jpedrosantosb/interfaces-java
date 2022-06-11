package interface1.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interface1.model.entities.AluguelCarro;
import interface1.model.entities.Veiculo;
import interface1.model.service.AluguelService;
import interface1.model.service.ImpostoBrasilService;

/**
 * Uma locadora brasileira de carros cobra um valor por hora para loca��es de
 * at� 12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o
 * ser� cobrada com base em um valor di�rio. Al�m do valor da loca��o, �
 * acrescido no pre�o o valor do imposto conforme regras do pa�s que, no caso do
 * Brasil, � 20% para valores at� 100.00, ou 15% para valores acima de 100.00.
 * Fazer um programa que l� os dados da loca��o (modelo do carro, instante
 * inicial e final da loca��o), bem como o valor por hora e o valor di�rio de
 * loca��o. O programa deve ent�o gerar a nota de pagamento (contendo valor da
 * loca��o, valor do imposto e valor total do pagamento) e informar os dados na
 * tela.
 */
public class Programa {

  public static void main(String[] args)
    throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    System.out.println("Insira os dados de aluguel");
    System.out.print("Modelo do carro: ");
    String modeloCarro = sc.nextLine();
    System.out.print("Entrada (dd/MM/yyyy HH:mm): ");
    Date inicio = sdf.parse(sc.nextLine());
    System.out.print("Saida (dd/MM/yyyy HH:mm): ");
    Date fim = sdf.parse(sc.nextLine());

    AluguelCarro cr = new AluguelCarro(inicio, fim,
                                       new Veiculo(modeloCarro));

    System.out.print("Entre com pre�o por hora: ");
    double precoPorHora = sc.nextDouble();
    System.out.print("Entre com pre�o por dia: ");
    double precoPorDia = sc.nextDouble();

    AluguelService aluguelService = new AluguelService(precoPorDia,
                                                       precoPorHora,
                                                       new ImpostoBrasilService());

    aluguelService.fatura(cr);

    System.out.println("FATURA:");
    System.out.println("Pagamento B�sico: "
        + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
    System.out.println("Imposto: "
        + String.format("%.2f", cr.getFatura().getImposto()));
    System.out.println("Total pagamento: "
        + String.format("%.2f", cr.getFatura().getPagamentoTotal()));

    sc.close();
  }

}
