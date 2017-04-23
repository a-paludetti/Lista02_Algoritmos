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
public class Es_13 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = NN.nextDouble();
        double soma = 0;
        int i = 0;
        double j = 1;
        do {
            soma = soma + j;
            j = ((j * (j + 1)) / (j * (j + 2)));
            System.out.println(j);
            i++;
        } while (i <= n1);
        System.out.println(soma);
    }
}
