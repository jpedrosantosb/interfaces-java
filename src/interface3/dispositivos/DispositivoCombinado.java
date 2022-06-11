package interface3.dispositivos;

public class DispositivoCombinado extends Dispositivo implements Scanner, Impressora{

  
  public DispositivoCombinado(String identificador) {
    super(identificador);
  }

  @Override
  public void imprimir(String doc) {
    System.out.println("Impress�o de combina��o: " + doc);
  }

  @Override
  public String scanear() {

    return "Resultado da verifica��o combinada";
  }

  @Override
  public void processaDoc(String doc) {
    System.out.println("Processamento de combina��o: " + doc);
  }

}
