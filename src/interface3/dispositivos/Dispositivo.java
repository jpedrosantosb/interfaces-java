package interface3.dispositivos;

public abstract class Dispositivo {

  private String identificador;

  
  public Dispositivo(String identificador) {
    this.identificador = identificador;
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }
  
  public abstract void processaDoc(String doc);
  
}
