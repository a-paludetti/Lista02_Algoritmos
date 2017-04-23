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
public class Es_15 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = NN.nextDouble();
        double resultado = n1;

        for (int i = 1; i <= n1; i++) {
            resultado = resultado * (n1 - i);
            System.out.println(resultado);
        }

        System.out.println(resultado);
    }
}
