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
public class Es_12 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("digite um número: ");
        double N1 = NN.nextDouble();
        double j = 1;
        double x = 1;
        double soma = 0;
        int i = 1;
        do {
            x = N1 - 1;
            System.out.println(x);
            j = ((j + 1) / x);
            System.out.println(j);
            soma = soma + j;
            if (x <= 0) {
                j = (x + 1) / j;
                soma = soma + j;
            }
            i++;
        } while (i <= N1);
        System.out.print("Soma: " + soma);
    }
}
