package br.ufrpe.sistema_bancario;

import br.ufrpe.sistema_bancario.beans.Conta;
import br.ufrpe.sistema_bancario.negocio.ControladorContas;

public class Principal {

  public static void main(String[] args) {
    ControladorContas controlador = new ControladorContas();
    
    controlador.cadastrar(new Conta("1234-5", 500));
    controlador.cadastrar(new Conta("444-5", 500));
    controlador.cadastrar(new Conta("00015-9", 500));
    controlador.cadastrar(new Conta("8889-7", 500));
    
    controlador.transferir("1234-5", "8889-7", 250);
    
    Conta c = controlador.procurar("1234-5");
    System.out.println(c);
    System.out.println(c.getClass());
    
    controlador.remover("444-5");
    controlador.remover("000777-8");
    
    //Alteração local
    System.out.println(controlador.procurar("00015-9"));
    
    //Segunda alteração
    System.out.println("Hello World");
  }

}
