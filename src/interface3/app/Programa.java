package interface3.app;

import interface3.dispositivos.DispositivoCombinado;
import interface3.dispositivos.ImpressoraConcreta;
import interface3.dispositivos.ScannerConcreta;

public class Programa {

  public static void main(String[] args) {
  
    ImpressoraConcreta p = new ImpressoraConcreta("1080");
    p.processaDoc("Minha carta");
    p.imprimir("Minha carta");

    System.out.println();
    ScannerConcreta s = new ScannerConcreta("2003");
    s.processaDoc("Meu Email");
    System.out.println("Resultado do Scan: " + s.scanear());
    
    System.out.println();
    DispositivoCombinado c = new DispositivoCombinado("2081");
    c.processaDoc("Minha Dissertação");
    c.imprimir("Minha Dissertação");
    System.out.println("Resultado do Scan: " + c.scanear());
    
  }

}
