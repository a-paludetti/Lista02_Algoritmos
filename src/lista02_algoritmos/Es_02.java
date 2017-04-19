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
public class Es_02 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = NN.nextInt();
        int soma = 0;
        int i = 1;

        while (i < n1) {
            soma = soma + n1;
            i++;
        }
        System.out.print("Soma = " + soma);
    }
}
