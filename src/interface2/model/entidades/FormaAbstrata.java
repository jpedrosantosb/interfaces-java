package interface2.model.entidades;

import interface2.model.enums.Cores;

public abstract class FormaAbstrata implements Forma {
  
  private Cores cor;
  
  public FormaAbstrata(Cores cor) {
    this.cor = cor;
  }

  public Cores getCor() {
    return cor;
  }

  public void setCor(Cores cor) {
    this.cor = cor;
  }
  
}
