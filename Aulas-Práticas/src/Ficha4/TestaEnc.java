package Ficha4;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class TestaEnc {

    public static void main(String[] args){
        LinhaEncomenda l1 = new LinhaEncomenda("1122", "Bananas", 2.99, 5, 0.25, 0.10);
        LinhaEncomenda l2 = new LinhaEncomenda("2233", "Compal", 5, 10, 0.15, 0.10);

        ArrayList<LinhaEncomenda> linhas = new ArrayList<>();
        linhas.add(l1.clone());
        linhas.add(l2.clone());

        EncEficiente encomenda = new EncEficiente("Miguel", "22338181", "Rua de Fafe", "A20", linhas,LocalDate.now());

        System.out.println(encomenda.toString());

        System.out.println("------------------- Pergunta ii) -------------------");
        System.out.println("O valor total da encomenda é: " + encomenda.calculaValorTotal());

        System.out.println("------------------- Pergunta iii) -------------------");
        System.out.println("O valor total do desconto é: " + encomenda.calculaValorDesconto());

        System.out.println("------------------- Pergunta iv) -------------------");
        System.out.println("O numero total de produtos é: " + encomenda.numeroTotalProdutos());

        System.out.println("------------------- Pergunta v) -------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserir ref para verificar se a encomenda existe: ");
        String ref = sc.next();
        System.out.println("A encomenda existe? " + encomenda.existeProdutoEncomenda(ref));


        System.out.println("------------------- Pergunta vi) -------------------");
        System.out.println("Adicionar linha vazia");
        LinhaEncomenda l3 = new LinhaEncomenda();
        encomenda.adicionaLinha(l3);
        System.out.println(encomenda.toString());

        System.out.println("------------------- Pergunta vii) -------------------");
        System.out.println("Escolha a encomenda a ser removida: ");
        String cod = sc.next();
        encomenda.removeProduto(cod);
        System.out.println(encomenda.toString());
    }

}
