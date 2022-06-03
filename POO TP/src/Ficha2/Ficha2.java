package Ficha2;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Ficha2 {

    // 1)
    public void a(int[] num) {
        int min = Integer.MAX_VALUE;
        int pos = -1;

        for(int i = 0; i<num.length; i++) {
            if(num[i]<min) {
                min = num[i];
                pos = i;
            }
        }

        if(pos == -1) {System.out.println("O array está vazio.");}
        else {System.out.println("Minimo = " + min + " na posicao " + pos);}
    }

    public void b(int[] num, int indice1, int indice2) {

        int quantos = indice2-indice1;
        int[] valores = new int[quantos+1];

        System.arraycopy(num,indice1,valores,0,quantos+1);

        System.out.println("O array entre os valores é: ");
        System.out.println();
        for (int valor : valores) {
            System.out.println(valor);
        }
    }

    public void c(int[] a, int[] b ) {
        int maior = Math.max(a.length, b.length);

        int[] aux = new int[maior];

        for(int i = 0; i<=maior; i++) {
            if(a[i] == b[i]) aux[i] = a[i];
        }

        System.out.println("O array de valores é: ");
        System.out.println();
        for(int valor: aux) {
            System.out.println(valor);
        }
    }

    // 4)

    public int[] um(int[] array) {
        Arrays.sort(array);

        return array;
    }

    public int procuraB(int[]a, int v) {
        return Arrays.binarySearch(a,v);
    }
}
