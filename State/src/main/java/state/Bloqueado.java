/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author JCMB
 */
public class Bloqueado implements IContaState {
    private Conta conta;
    
    @Override
    public String toString() {
        return "Bloqueado";
    }

    public Bloqueado(Conta pConta) {
        this.conta = pConta;
    }

    // Implementação dos métodos da interface IContaState
    @Override
    public void saque(double valor) {
        System.out.println("Conta bloqueada, saque cancelado, saldo atual: " + this.conta.getSaldo());
    }

    @Override
    public void deposito(double valor) {
        this.conta.setSaldo(this.conta.getSaldo() + valor);
        System.out.println("Foi depositado: " + valor + ", saldo atual: " + this.conta.getSaldo());

        if (this.conta.getSaldo() < 0) {
            if (this.conta.getSaldo() <= -100.00) {
                this.conta.setMeuEstado(new Bloqueado(this.conta));
            } else {
                this.conta.setMeuEstado(new SaldoPositivo(this.conta));
            }
        }
    }
}