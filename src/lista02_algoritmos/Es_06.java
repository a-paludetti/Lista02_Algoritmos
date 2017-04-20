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
public class Es_06 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        int cmp = 0;
        String nome = "";
        String nome1 = "";
        int idade;
        int i = 1;

        do {
            System.out.print("Nome: ");
            nome = NN.nextLine();
            System.out.print("Idade: ");
            idade = Integer.parseInt(NN.nextLine());

            if (idade > cmp) {
                cmp = idade;
                nome1 = nome;
            }
            i++;
        } while (i <= 5);

        System.out.printf(nome1 + ", com " + cmp + ",  é a pessoa mais velha.");
    }

}
