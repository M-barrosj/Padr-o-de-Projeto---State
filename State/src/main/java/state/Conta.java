/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author JCMB
 */
public class Conta {
    private Double saldo;
    private IContaState meuEstado;

    public Conta() {
        this.saldo = 0.0;
        this.meuEstado = new SaldoPositivo(this); // Inicialização do objeto meuEstado
    }

    public Conta(Double valor) {
        this.meuEstado = new SaldoPositivo(this);
        this.deposito(valor);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public IContaState getMeuEstado() {
        return meuEstado;
    }

    public void setMeuEstado(IContaState meuEstado) {
        this.meuEstado = meuEstado;
    }

    public void saque(Double valor) {
        this.meuEstado.saque(valor);
        System.out.println("Estado da conta: " + this.meuEstado.toString() + "\n");
    }

    public void deposito(Double valor) {
        this.meuEstado.deposito(valor);
        System.out.println("Estado da conta: " + this.meuEstado.toString() + "\n");
    }
}
