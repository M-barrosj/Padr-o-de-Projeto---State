/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package state;

/**
 *
 * @author JCMB
 */
public class State {

    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.deposito(100.0);
        conta.saque(50.0);
        conta.saque(50.0);
        conta.saque(80.0);
        conta.deposito(80.0);
        conta.saque(100.0);
    }
}
    

