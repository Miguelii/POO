package Ficha3;

import java.time.LocalDate;

public class TesteEnc {
    public static void main(String[] args) {
        LinhaEncomenda l1 = new LinhaEncomenda("1","Monitor",100,1,0.23f,5);
        LinhaEncomenda l2 = new LinhaEncomenda("2","rato",100,1,0.23f,5);
        LinhaEncomenda[] linha = {l1,l2};

        //Encomenda e1 = new Encomenda("Miguel",233910595,"Rua da Eira Velha","Enc1", LocalDate.now(),linha);

    }
}
