package Ficha3;

import java.util.Scanner;

public class TesteCirculo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ponto p1 = new Ponto(5,-1);
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto(10,0);

        Circulo c1 = new Circulo(5,p1);

        System.out.println(c1.calculaPerimetro());
        System.out.println(c1.calculaArea());

        ColCirculo cc = new ColCirculo();
        for(int i=1;i<10;i++) {
            cc.addCirculo(new Circulo(i,new Ponto(i,i)));
        }

        System.out.println("Colecao" + cc);
        ColCirculo cc1 = cc.clone();
        System.out.println("Colecao clone" + cc1);
        System.out.println(cc.equals(cc1));

        for(int i=1;i<10;i++) {
            Circulo cp = new Circulo(i,new Ponto(i,i));
            System.out.println(cp + " " + cc.existeCirculos(cp));
        }
    }
}
