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
public class Es_16 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("quantidade de valores: ");
        int qtd = NN.nextInt();
        int i = 1;

        do {
            System.out.print("Número: ");
            int n1 = NN.nextInt();
            if (n1 % 2 == 0 & n1 > 0) {
                System.out.println("Par, positivo");
            } else if (n1 % 2 != 0 && n1 > 0) {
                System.out.println("Ímpar, positivo");
            } else if (n1 % 2 == 0 && n1 < 0) {
                System.out.println("Par, negativo.");
            } else if (n1 % 2 != 0 && n1 < 0) {
                System.out.println("Ímpar, negativo.");
            } else {
                System.out.println("Nulo.");
            }
            i++;
        } while (i <= qtd);
    }
}
