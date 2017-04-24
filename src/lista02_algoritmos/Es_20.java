/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02_algoritmos;

import java.util.Scanner;

/**
 *
 * @author Wynter
 */
public class Es_20 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("Saldo na conta: ");
        int saldo = NN.nextInt();
        int deposito = 0;
        int saque = 0;
        
        System.out.println("Digite:\n'1' para depósito,\n'2' para saque,\n'3' para finalizar: ");
        String oprc = NN.nextLine();

        switch (oprc) {
            case "1":
                System.out.print("valor do depósito: ");
                deposito = NN.nextInt();
                saldo = saldo + deposito;
                System.out.println("Digite:\n'1' para continuar ou \n'3' para encerrar.");
                oprc = NN.nextLine();
                break;
            case "2":
                System.out.print("valor do saque: ");
                saque = NN.nextInt();
                saldo = saldo - saque;
                System.out.println("Digite:\n'1' para continuar ou \n'3' para encerrar.");
                oprc = NN.nextLine();
                break;
            case "3":
                if (saldo == 0) {
                    System.out.println("CONTA ZERADA.");
                } else if (saldo < 0) {
                    System.out.println("CONTA ESTOURADA.");
                } else {
                    System.out.println("CONTA PREFERENCIAL.");
                }
                break;
            default:
                System.out.println("operação invalida");
                break;

        }
        System.out.println("R$" + saldo);
    }
}
