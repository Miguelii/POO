package Ficha1;

import java.time.LocalDateTime;

public class Ficha1 {

    //Implementacao dos metodos

    //1
    public double celsiusParaFarenheit(double graus) {
        double res;

        res = (graus*1.8)+32;

        return res;
    }

    //2
    public int maximoNumeros(int a, int b) {

        return Math.max(a, b);
    }

    //3
    public String criaDescricaoConta(String nome, double saldo) {
        return "Nome: " + nome + "\n Saldo: " + saldo;
    }

    //4
    public double eurosParaLibras(double valor, double taxaConversao) {

        return valor * taxaConversao;
    }

    //5
    public void cincum(int a, int b) {

        System.out.println("Inteiro 1: ");
        System.out.println();
        for(int i = a; i>=0; i--) {
            System.out.println(i);
        }

        System.out.println("Inteiro 2: ");
        System.out.println();
        for(int i = b; i>=0; i--) {
            System.out.println(i);
        }
    }

    //6
    public long factorial(int num) {
        long fact = 1;
        for(int i = 1; i<=num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //7
    public long tempoGasto() {
        long antes = System.currentTimeMillis();
        this.factorial(5000);
        long depois = System.currentTimeMillis();
        return depois-antes;
    }
}
