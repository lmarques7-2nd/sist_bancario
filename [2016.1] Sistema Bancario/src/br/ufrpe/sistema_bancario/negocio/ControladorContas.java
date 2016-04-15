package br.ufrpe.sistema_bancario.negocio;

import br.ufrpe.sistema_bancario.beans.Conta;
import br.ufrpe.sistema_bancario.dados.RepositorioContas;

public class ControladorContas {
  private RepositorioContas repositorio;

  public ControladorContas() {
    this.repositorio = new RepositorioContas(100);
  }

  public void transferir(String numOrigem, String numDestino, double valor) {
    Conta origem = this.repositorio.procurar(numOrigem);
    Conta destino = this.repositorio.procurar(numDestino);
    if (origem != null && destino != null && origem.getSaldo() >= valor) {
      origem.debitar(valor);
      destino.creditar(valor);
      System.out.println("Transferência realizada com sucesso");
    } else {
      System.out.println("Impossível realizar transferência");
    }
  }
  
  public void cadastrar(Conta c) {
    this.repositorio.cadastrar(c);
  }

  /**
   * @param num
   * @return
   * @see br.ufrpe.sistema_bancario.dados.RepositorioContas#procurar(java.lang.String)
   */
  public Conta procurar(String num) {
    return repositorio.procurar(num);
  }

  /**
   * @param num
   * @see br.ufrpe.sistema_bancario.dados.RepositorioContas#remover(java.lang.String)
   */
  public void remover(String num) {
    repositorio.remover(num);
  }
  
  

}
