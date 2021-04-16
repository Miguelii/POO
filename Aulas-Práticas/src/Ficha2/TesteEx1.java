package Ficha2;

import java.util.Scanner;
import java.util.Arrays;

public class TesteEx1 {

    public static void main(String[] args) {
        Ex1 f = new Ex1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Alinea a) ");
        System.out.println("Numero de inteiros a ler?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        System.out.println("Insira " + n + " numeros: ");
        for(int i=0; i<n; i++) {
            numeros[i] = sc.nextInt();
        }

        int minimo = f.minimo(numeros);
        System.out.println("O minimo é: " + minimo);

        System.out.println("Alinea b)");
        System.out.println("Qual o indice inicial? ");
        int ni = sc.nextInt();
        System.out.println("Qual o  indice final? ");
        int nf = sc.nextInt();

        int[] res = f.subArray(numeros, ni, nf);
        System.out.println("Array resultado: " + Arrays.toString(res)); // Temos que transformar o res em String

        int[] numeros2 = new int[n];
        System.out.println("Insira " + n + " numeros: ");
        for(int i=0; i<n; i++)
            numeros2[i] = sc.nextInt();

        int[] comuns = f.comuns(numeros,numeros2);
        System.out.println("Array resultado: " + Arrays.toString(comuns));
    }
}
