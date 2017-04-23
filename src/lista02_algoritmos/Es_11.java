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
public class Es_11 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double N1 = NN.nextDouble();
        double sinal = -1;
        int i = 1;
        double soma = 0;
        double j = 1;

        do {
            soma = soma + j;
            j = (j / (j + 1)) * sinal;
            i++;
        } while (i <= N1);
        System.out.print("Soma: " + soma);
    }
}
