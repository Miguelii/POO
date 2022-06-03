package Ficha2;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Ficha2 f2 = new Ficha2();

    public static void ex1a() {
        System.out.println("Numero total de inteiros? ");
        int tam = sc.nextInt();
        int[] num = new int[tam];

        for(int i = 0; i<tam;i++) {
            System.out.println("Insira os inteiros: ");
            num[i] = sc.nextInt();
        }

        f2.a(num);
    }

    public static void ex1b() {
        System.out.println("Numero total de inteiros? ");
        int tam = sc.nextInt();
        int[] num = new int[tam];


        System.out.println("Insira os inteiros: ");
        for(int i = 0; i<num.length;i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Insira os dois indices: ");
        int ind1 = sc.nextInt();
        int ind2 = sc.nextInt();


        f2.b(num,ind1,ind2);
    }

    public static void ex1c() {
        System.out.println("Numero total de inteiros do array 1? ");
        int tam1 = sc.nextInt();
        int[] a = new int[tam1];

        System.out.println("Insira os inteiros: ");
        for(int i = 0; i<a.length;i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Numero total de inteiros do array 2? ");
        int tam2 = sc.nextInt();
        int[] b = new int[tam2];

        System.out.println("Insira os inteiros: ");
        for(int i = 0; i<b.length;i++) {
            b[i] = sc.nextInt();
        }

        f2.c(a,b);
    }

    public static void main(String[] args) {

        ex1c();

    }
}
