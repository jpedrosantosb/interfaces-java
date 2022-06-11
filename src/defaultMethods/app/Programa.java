package defaultMethods.app;

import java.util.Locale;
import java.util.Scanner;

import defaultMethods.services.InterestService;
import defaultMethods.services.UsaInterestService;

public class Programa {

//  Fazer um programa para ler uma quantia e a duração em meses de um
//  empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
//  empréstimo, conforme regras de juros USA. A regra de cálculo de
//  juros do Brasil é juro composto padrão de 2% ao mês.
  
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Amount: ");
    double amount = sc.nextDouble();
    System.out.print("Months: ");
    int months = sc.nextInt();
    
    InterestService is = new UsaInterestService(2.0);
    double payment = is.payment(amount, months);
    
    System.out.println("Payment after " + months + " months:");
    System.out.println(String.format("%.2f", payment));
    
    sc.close();
  }

}
