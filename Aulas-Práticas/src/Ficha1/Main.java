package Ficha1;

import java.util.Scanner;

public class Main {
    private static Ficha1 f1;
    private static Scanner in;

    private static void exercicio1 (){
        System.out.println("Temperatura em Celsius: ");
        double c = in.nextDouble();
        double f = f1.celsiusParaFarecheit(c);
        System.out.println("Em Fahrenheit: " + f);
    }

    private static void exercicio2 () {
        System.out.println("Primeiro numero: ");
        int a = in.nextInt();
        System.out.println("Segundo numero: ");
        int b = in.nextInt();
        int max = f1.maximoNumeros(a,b);
        System.out.println("O máximo dos dois numeros é: " + max);

    }

    private static void exercicio3 () {
        System.out.println("Nome: ");
        String nome = in.nextLine();
        System.out.println("Saldo: ");
        double saldo = in.nextDouble();
        System.out.println(f1.criaDescricaoConta(nome, saldo));
    }

    private static void exercicio7() {
        System.out.println("Factorial de 5000 demorou: " + f1.tempoGasto());
    }


    public static void main(String[] args) {
        f1 = new Ficha1();
        in = new Scanner(System.in);

        exercicio1();
        exercicio2();
        exercicio3();
        exercicio7();

        in.close();

    }
}
