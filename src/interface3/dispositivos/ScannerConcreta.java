package interface3.dispositivos;

public class ScannerConcreta extends Dispositivo implements Scanner{

  
  public ScannerConcreta(String identificador) {
    super(identificador);
   
  }

  @Override
  public String scanear() {
    return "Conteúdo digitalizado.";
  }

  @Override
  public void processaDoc(String doc) {
    System.out.println("Processamento do scanner: " + doc); 
  }

}
