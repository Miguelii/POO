package Ficha1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Iniciar Scanner para leitura
        Scanner sc = new Scanner(System.in);

        //Criar objeto da classe que implementa os métodos
        Ficha1 f1 = new Ficha1();


        //Pergunta 1
        System.out.println("-- Pergunta 1 -- \n");
        System.out.println();
        System.out.println("Insira a temperatura em celsius: ");
        double temp = sc.nextDouble();
        System.out.println("A temperatura em Farenheit é: " + f1.celsiusParaFarenheit(temp));
        System.out.println();

        //Pergunta 2
        System.out.println("-- Pergunta 2 -- ");
        System.out.println();
        System.out.println("Insira o primeiro inteiro: ");
        int a = sc.nextInt();
        System.out.println("Insira o segundo inteiro: ");
        int b = sc.nextInt();
        System.out.println("O maior inteiro é: " + f1.maximoNumeros(a,b));
        System.out.println();

        //Pergunta 3
        System.out.println("-- Pergunta 3 -- ");
        System.out.println();
        System.out.println("Insira o nome e saldo: ");
        String nome = sc.nextLine();
        double saldo = sc.nextDouble();
        String str = f1.criaDescricaoConta(nome,saldo);
        System.out.println("Resposta =" + str);


        //pergunta 4
        System.out.println("-- Pergunta 4 -- ");
        System.out.println();
        System.out.println("Insira quantidade em euros: ");
        double valor = sc.nextDouble();
        System.out.println("Insira taxa de conversao: ");
        double taxa = sc.nextDouble();
        System.out.println("Conversão: " + " Em Euros -> " + valor + " Em Libras -> " + f1.eurosParaLibras(valor,taxa));

        //pergunta 5
        System.out.println("-- Pergunta 5 -- ");
        System.out.println();
        System.out.println("Insira primeiro inteiro: ");
        int aa = sc.nextInt();
        System.out.println("Insira segundo inteiro: ");
        int bb = sc.nextInt();
        f1.cincum(aa,bb);


        //pergunta 6
        System.out.println("-- Pergunta 5 -- ");
        System.out.println();
        System.out.println("Insira o numero: ");
        int number = sc.nextInt();
        System.out.println("O factorial é: " + f1.factorial(number));

        //pergunta 7
        System.out.println("-- Pergunta 7 -- ");
        System.out.println();
        System.out.println("O factorial demorou: " + f1.tempoGasto());

        sc.close();


    }
}
