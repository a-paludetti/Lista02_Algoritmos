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
public class Es_21 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = NN.nextInt();
        int i = 1;
        int j = 0;
        do {
            if (n1 % i == 0) {
                j = j + i;
            }
            i++;
        } while (i < n1);
        if (j == n1) {
            System.out.println(n1 + " é um número perfeito.");
        }
    }
}
