package Ficha3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Encomenda extends LinhaEncomenda {
    private String nome;
    private int nif;
    private String morada;
    private String nrEnc;
    private LocalDate dataEnc;
    private List<LinhaEncomenda> linhasEnc;
    //private LinhaEncomenda[] linhaEnc;


    public Encomenda() {
        this.nome = " ";
        this.nif = 0;
        this.morada = " ";
        this.nrEnc = " ";
        this.linhasEnc = new ArrayList<>();
    }

    public Encomenda(String nome, int nif, String morada, String nrEnc, LocalDate dataEnc, List<LinhaEncomenda> linhasEnc) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.nrEnc = nrEnc;
        this.dataEnc = dataEnc;

        this.linhasEnc = new ArrayList<>(linhasEnc.size());
        for(LinhaEncomenda c: linhasEnc) {
            this.linhasEnc.add(c.clone());
        }
    }

    public Encomenda(Encomenda e) {
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.nrEnc = e.getNrEnc();
        this.linhasEnc = e.getLinhaEnc();
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

    public List<LinhaEncomenda> getLinhaEnc() {
        List<LinhaEncomenda> res = new ArrayList<>();
        for(LinhaEncomenda c : this.linhasEnc) {
            res.add(c.clone());
        }
        return res;
    }

    public void setLinhaEnc(List<LinhaEncomenda> linhasEnc) {
        this.linhasEnc = new ArrayList<>();
        for(int i=0; i<linhasEnc.size();i++) {
            LinhaEncomenda c = linhasEnc.get(i);
            this.linhasEnc.add(c.clone());
        }
    }

    // b)
    public double calculaValorTotal() {
        double soma = 0;
        for(LinhaEncomenda linhas : linhasEnc) {
            soma += linhas.calculaValorLinhaEnc();
        }
        return soma;
    }

    // c)
    public double calculaValorDesconto() {
        double soma = 0;
        for(LinhaEncomenda linhas : linhasEnc) {
            soma += linhas.calculaValorDesconto();
        }
        return soma;
    }

    // d)
    public int numeroTotalProdutos() {
        int total = 0;
        for(LinhaEncomenda linhas : linhasEnc) {
            total += linhas.getQuantidade();
        }
        return total;
    }

    // e)
    public boolean existeProdutorEncomenda(String refProduto) { // VERIFICAR
        for(LinhaEncomenda linhas : linhasEnc) {
            if(Objects.equals(refProduto, linhas.getCodigo())) return true;
        }
        return false;
    }

    // f)
    public void adicionaLinha(LinhaEncomenda linha) {

    }
}
