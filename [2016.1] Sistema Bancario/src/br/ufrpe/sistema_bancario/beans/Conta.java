package br.ufrpe.sistema_bancario.beans;

public class Conta {
  
  private String numero;
  private double saldo;
  
  public Conta() {
    this.numero = "";
    this.saldo = 0.0;
  }
  
  public Conta (String numero, double saldo) {
    this.numero = numero;
    this.saldo = saldo;
  }
  
  public void creditar(double valor) {
    this.saldo += valor;
  }
  
  public void debitar (double valor) {
    if (this.saldo >= valor) {
      this.saldo = this.saldo - valor;
    }
  }

  /**
   * @return the numero
   */
  public String getNumero() {
    return numero;
  }

  /**
   * @param numero the numero to set
   */
  public void setNumero(String numero) {
    this.numero = numero;
  }

  /**
   * @return the saldo
   */
  public double getSaldo() {
    return saldo;
  }
  
  @Override
  public String toString() {
    return "Número da conta: "+ this.numero + "\n  ###SALDO: " + this.saldo + "###";
  }

}
