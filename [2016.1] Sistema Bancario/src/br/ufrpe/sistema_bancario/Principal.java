package br.ufrpe.sistema_bancario;

import br.ufrpe.sistema_bancario.beans.Conta;
import br.ufrpe.sistema_bancario.negocio.ControladorContas;

public class Principal {
  //Outro user

  public static void main(String[] args) {
    ControladorContas controlador = new ControladorContas();
    
    controlador.cadastrar(new Conta("1234-5", 500));
    controlador.cadastrar(new Conta("444-5", 500));
    controlador.cadastrar(new Conta("00015-9", 500));
    controlador.cadastrar(new Conta("8889-7", 500));
    
    controlador.transferir("1234-5", "8889-7", 250);
    
    //balão, transferência
    //nova linha
    Conta c = controlador.procurar("1234-5");
    System.out.println(c);
    System.out.println(c.getClass());
    
    controlador.remover("444-5");
    controlador.remover("000777-8");
    
    //Alteração local agora a partir do eclipse
    System.out.println(controlador.procurar("00015-9"));
    
    //Classe azul só
    System.out.println("Hello World");
  }

}
