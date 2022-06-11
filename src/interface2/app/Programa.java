package interface2.app;

import interface2.model.entidades.Circulo;
import interface2.model.entidades.FormaAbstrata;
import interface2.model.entidades.Retangulo;
import interface2.model.enums.Cores;

public class Programa {

  public static void main(String[] args) {
    FormaAbstrata forma1 = new Circulo(Cores.PRETO, 2.0);
    FormaAbstrata forma2 = new Retangulo(Cores.BRANCO, 3.0, 4.0);
    
    System.out.println("Cor do Circulo: " + forma1.getCor());
    System.out.println("Area do Circulo: " + String.format("%.2f", forma1.area()));
    System.out.println("Cor do Retangulo: " + forma2.getCor());
    System.out.println("Area do Retangulo: " + String.format("%.2f", forma2.area()));
  }

}
