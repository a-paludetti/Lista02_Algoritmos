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
public class Es_09 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("Quantos alunos a sala tem? ");
        double alunos = NN.nextInt();
        int i = 1;
        double nota;
        double media1 = 0;
        double media2 = 0;

        while (i <= alunos) {
            System.out.print("Digite a nota do aluno #" + i + ": ");
            nota = NN.nextDouble();
            media1 = nota + media1;
            media2 = media1 / alunos;
            i++;
        }
        System.out.print("média da sala: " + media2);
    }

}
