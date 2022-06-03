package Ficha4;

import Ficha3.Encomenda;
import Ficha3.LinhaEncomenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EncEficiente {

    private String nome;
    private int nif;
    private String morada;
    private String nrEnc;
    private LocalDate dataEnc;
    private ArrayList<LinhaEncomenda> encomendas;

    //////// Construtores

    public EncEficiente() {
        this.nome = " ";
        this.nif = 0;
        this.morada = " ";
        this.nrEnc = " ";
        this.encomendas = new ArrayList<>();
    }

    public EncEficiente(String nome, int nif, String morada, String nrEnc, LocalDate dataEnc, ArrayList<LinhaEncomenda> encomendas) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.nrEnc = nrEnc;
        this.dataEnc = dataEnc;

        //Para o ArrayList
        this.encomendas = new ArrayList<>(encomendas.size());
        for(LinhaEncomenda e : encomendas) {
            this.encomendas.add(e.clone());
        }
    }

    public EncEficiente(EncEficiente e) {
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.nrEnc = e.getNrEnc();
        this.dataEnc = e.getDataEnc();
        this.encomendas = e.getEncomendas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNrEnc() {
        return nrEnc;
    }

    public void setNrEnc(String nrEnc) {
        this.nrEnc = nrEnc;
    }

    public LocalDate getDataEnc() {
        return dataEnc;
    }

    public void setDataEnc(LocalDate dataEnc) {
        this.dataEnc = dataEnc;
    }

    // Getter e Setter para o ArrayList
    public ArrayList<LinhaEncomenda> getEncomendas() {
        ArrayList<LinhaEncomenda> res = new ArrayList<>();
        for(LinhaEncomenda e : this.encomendas) {
            res.add(e.clone());
        }
        return res;
    }

    public void setEncomendas(ArrayList<LinhaEncomenda> encomendas) {
        this.encomendas = new ArrayList<>();
        for(LinhaEncomenda e : encomendas) {
            this.encomendas.add(e.clone());
        }
    }

    @Override
    public String toString() {
        return "EncEficiente{" +
                "nome='" + nome + '\'' +
                ", nif=" + nif +
                ", morada='" + morada + '\'' +
                ", nrEnc='" + nrEnc + '\'' +
                ", dataEnc=" + dataEnc +
                ", encomendas=" + encomendas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EncEficiente e = (EncEficiente) o;
        return e.getNome().equals(this.nome) &&
                e.getMorada().equals(this.morada) &&
                e.getNif() == this.nif &&
                e.getNrEnc().equals(this.nrEnc) &&
                e.getDataEnc().equals(this.dataEnc) &&
                e.getEncomendas().equals(this.encomendas);
    }

    public EncEficiente clone() {
        return new EncEficiente(this);
    }

    ////////

    // ii) Valor total da encomenda
    public double calculaValorTotal() {
        double valorTotal = 0;
        for(LinhaEncomenda linhas : this.encomendas) {
            valorTotal += linhas.calculaValorLinhaEnc();
        }
        return valorTotal;

        // OU
        //return this.encomendas.stream().mapToDouble(LinhaEncomenda::calculaValorLinhaEnc).sum();
    }

    // iii) Valor total do desconto
    public double calculaValorDesconto() {
        double valorTotal = 0;
        for(LinhaEncomenda linhas : this.encomendas) {
            valorTotal += linhas.calculaValorDesconto();
        }
        return valorTotal;

        // OU
        //return this.encomendas.stream().mapToDouble(LinhaEncomenda::calculaValorDesconto).sum();
    }

    // iv) Numero total de produtos a receber
    public int numeroTotalProdutos() {
        int count = 0;

        for(LinhaEncomenda linhas : this.encomendas) {
            count += linhas.getQuantidade();
        }
        return count;

        //OU
        //return this.encomendas.stream().mapToInt(LinhaEncomenda::getQuantidade).sum();
    }

    // v) Determina se produto vai ser encomendado
    public boolean existeProdutoEncomenda(String refProduto) {
        for(LinhaEncomenda linhas : this.encomendas) {
            if(refProduto.equals(linhas.getCodigo())) return true;
        }
        return false;

        //OU
        //return this.encomendas.stream().anyMatch(res -> res.getCodigo().equals(refProduto));
    }

    // vi) Adiciona nova linha de encomenda
    public void adicionaLinha(LinhaEncomenda linha) {
        this.encomendas.add(linha);
    }

    // vii) Remove uma linha dado a sua referencia de produto
    public void removeProduto(String codProd) {

        //Expressoes lambda
        // (parametros) -> (corpo da expressao)

        // Nao é necessário stream pois o removeIf já percorre a coleçao
        this.encomendas.removeIf(linhas -> (codProd.equals(linhas.getCodigo())));
    }


}
