package interface3.dispositivos;

public class DispositivoCombinado extends Dispositivo implements Scanner, Impressora{

  
  public DispositivoCombinado(String identificador) {
    super(identificador);
  }

  @Override
  public void imprimir(String doc) {
    System.out.println("Impressão de combinação: " + doc);
  }

  @Override
  public String scanear() {

    return "Resultado da verificação combinada";
  }

  @Override
  public void processaDoc(String doc) {
    System.out.println("Processamento de combinação: " + doc);
  }

}
