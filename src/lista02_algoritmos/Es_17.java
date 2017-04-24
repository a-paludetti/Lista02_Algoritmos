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
public class Es_17 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = NN.nextInt();
        int n2 = 0;

        for (int i = 0; i <= n1; i++) {
            n2 = n2 + 1;
            if (n1 % n2 == 0) {
                System.out.print(n2+" ");
            }
        }
    }
}
