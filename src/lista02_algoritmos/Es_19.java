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
public class Es_19 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = NN.nextLine();

        for (int i = 0; i <= i++; i++) {
            if (senha.equals("2002")) {
                System.out.println("Acesso permitido.");
                break;
            } else {
                System.out.print("Senha invalida.\nTente novamente: ");
                senha = NN.nextLine();
            }
        }
    }
}
