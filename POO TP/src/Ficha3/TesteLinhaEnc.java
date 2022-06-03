package Ficha3;

import java.time.LocalDate;

public class TesteLinhaEnc {
    public static void main(String[] args) {
        LinhaEncomenda l1 = new LinhaEncomenda("1","Monitor",100,1,0.23f,5);

        System.out.println(l1.calculaValorLinhaEnc());
        System.out.println(l1.calculaValorDesconto());
        System.out.println();
    }

}
