package interface3.dispositivos;

public class ImpressoraConcreta extends Dispositivo implements Impressora{

  public ImpressoraConcreta(String identificador) {
    super(identificador);
   
  }

  @Override
  public void imprimir(String doc) {
    System.out.println("Imprimindo: " + doc);
  }

  @Override
  public void processaDoc(String doc) {
    System.out.println("Processamento da impressora: " + doc); 
  }

}
