package br.ufrpe.sistema_bancario.dados;

import br.ufrpe.sistema_bancario.beans.Conta;

public class RepositorioContas {
  private Conta[] contas;
  private int proxima;

  public RepositorioContas(int tamanho) {
    this.contas = new Conta[tamanho];
    this.proxima = 0;
  }

  public void cadastrar(Conta c) {
    this.contas[this.proxima] = c;
    this.proxima = this.proxima + 1;
  }

  /**
   * Procura uma conta pelo seu número
   * 
   * @param num
   * @return
   */
  public Conta procurar(String num) {
    int i = procuraIndice(num);
    Conta resultado = null;
    if (i != this.proxima) {
      resultado = this.contas[i];
    } 
    return resultado;
  }

  private int procuraIndice(String num) {
    int i = 0;
    boolean achou = false;
    while ((!achou) && (i < this.proxima)) {
      if (num.equals(this.contas[i].getNumero())) {
        achou = true;
      } else {
        i = i + 1;
      }
    }
    return i;
  }
  
  public void remover(String num) {
    int i = procuraIndice(num);
    if (i != this.proxima) {
        this.contas[i] = this.contas[this.proxima - 1];
        this.contas[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
        System.out.println("Conta " + num + " removida");
    } else {
        System.out.println("Conta não existe.");
    }
}


}