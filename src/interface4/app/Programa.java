package interface4.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interface4.entities.Contrato;
import interface4.entities.Parcelamento;
import interface4.services.ContratoService;
import interface4.services.PaypalService;

public class Programa {

//  Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
//  um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
//  número de meses desejado.
//  A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
//  Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
//  por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
//  juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
//  Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
//  e valor total do contrato). Em seguida, o programa deve ler o número de meses para
//  parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
//  sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
//  meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela
  
  public static void main(String[] args)
    throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Insira os dados do Contrato");
    System.out.print("Numero: ");
    int numero = sc.nextInt();
    System.out.print("Data (dd/MM/yyyy): ");
    Date data = sdf.parse(sc.next());
    System.out.print("Valor do contrato:");
    double valorTotal = sc.nextDouble();

    Contrato contrato = new Contrato(numero, data, valorTotal);

    System.out.print("Insira o número de parcelas: ");
    int n = sc.nextInt();

    ContratoService contratoService = new ContratoService(new PaypalService());

    contratoService.processContrato(contrato, n);

    System.out.println("Parcelas: ");
    Double soma = 0.0;
    for (Parcelamento x : contrato.getParcelamentos()) {
      soma += x.getQuantia();
      System.out.println(x);
      
    }

    System.out.println("Valor total: " + String.format("%.2f", soma));
    sc.close();

  }

}
