package Ficha2;

import java.util.Scanner;
import java.util.Arrays;

public class TesteEx2 {

    public static void main(String[] args) {
        Ex2 t = new Ex2();
        int[][] paux = new int[5][5];
        Scanner is = new Scanner(System.in);
        System.out.println("Pauta: ");
        for(int i=0; i<paux.length; i++) {
            for(int j=0; j<paux[i].length; j++) {
                System.out.print("Aluno "+i+", UC: "+j+": ");
                paux[i][j] = is.nextInt();
            }
        }
        t.setNotasTurma(paux);

        paux[0][0] = 20;

        System.out.println(Arrays.deepToString(paux));

        System.out.println(Arrays.deepToString(t.getNotasTurma()));
    }
}
