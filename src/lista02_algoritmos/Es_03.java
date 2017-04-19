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
public class Es_03 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        int numero;
        int cmp = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            numero = NN.nextInt();
            if (numero > 0) {
                if (cmp < numero) {
                    cmp = numero;
                }
            } else {
                System.out.print("Número invalido, digite um número positivo: ");
                numero = NN.nextInt();
            }
        }
        System.out.println(cmp);
    }

}
