/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02_algoritmos;

/**
 *
 * @author Wynter
 */
public class Es_10 {

    public static void main(String[] args) {
        double j = 1;
        int i = 1;
        double soma = 0;
        do {
            soma = soma + j;
            j = (j / (j + 1));
            i++;
        } while (i <= 20);
        System.out.printf("resultado: %.2f", soma);
    }
}
