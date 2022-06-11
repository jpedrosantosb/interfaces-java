package interface2.model.entidades;

import interface2.model.enums.Cores;

public class Circulo extends FormaAbstrata {

  private Double raio;

  public Circulo(Cores cor, Double raio) {
    super(cor);
    this.raio = raio;
  }

  public Double getRaio() {
    return raio;
  }

  public void setRaio(Double raio) {
    this.raio = raio;
  }
  
  @Override
  public double area() {
      return Math.PI * raio * raio;
  }
}
