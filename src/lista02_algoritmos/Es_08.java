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
public class Es_08 {

    public static void main(String[] args) {
        int n1 = 0;
        int media = 0;
        int n2 = 0;
        for (int i = 13; i < 73; i++) {
            if (i % 2 == 0) {
                n1 = n1 + i;
                n2++;
                media = n1 / n2;
            }
        }
        System.out.println(media);
    }
}
