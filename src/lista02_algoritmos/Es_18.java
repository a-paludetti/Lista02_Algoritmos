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
public class Es_18 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite um número menor que 46: ");
        int n1 = NN.nextInt();
        int fbn1 = 0;
        int fbn2 = 1;
        int fbn3 = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 > 46) {
                System.out.print("Número invalido, digite um número menor que 46: ");
                n1 = NN.nextInt();
            } else {
                fbn3 = fbn1 + fbn2;
                fbn1 = fbn2;
                fbn2 = fbn3;
                System.out.print(fbn3 + " ");
            }
        }
    }

}
