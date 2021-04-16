package Ficha3;

import java.util.Arrays;
import java.lang.Object;
import java.time.LocalDate;

public class Encomenda {
    private String nome;
    private int nif;
    private String morada;
    private int numeroEncomenda;
    private Encomenda[] encomendas;

    /*
    Metodo para a data
     */
    public void data() {
        LocalDate x = LocalDate.parse("2021-03-13");
        LocalDate agora = LocalDate.now();
        LocalDate outradata = LocalDate.of(2021,3,12);
        LocalDate amanha = agora.plusDays(1);
    }
    /*

    Construtor por omissao
     */
    public Encomenda() {
        this.nome = " ";
        this.nif = 0;
        this.morada = " ";
        this.numeroEncomenda = 0;
    }

    /*
    Construtor de parametrizado
     */

    public Encomenda(String nome, int nif, String morada, int numeroEncomenda, Encomenda[] encomendas) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.numeroEncomenda = numeroEncomenda;
        this.encomendas = encomendas;
    }

    /*
    Construtor de Copia
     */
    public Encomenda(Encomenda e) {
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.numeroEncomenda = e.getNumeroEncomenda();
    }

    /*
    Gets e Sets
     */
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
    public int getNumeroEncomenda() {
        return numeroEncomenda;
    }
    public void setNumeroEncomenda(int numeroEncomenda) {
        this.numeroEncomenda = numeroEncomenda;
    }
    public Encomenda[] getEncomendas() {
        return encomendas;
    }
    public void setEncomendas(Encomenda[] encomendas) {
        this.encomendas = encomendas;
    }

    /*
    Metodo toString
     */
    public String toString() {
        return "Encomenda{" +
                "nome='" + nome + '\'' +
                ", nif=" + nif +
                ", morada='" + morada + '\'' +
                ", numeroEncomenda=" + numeroEncomenda +
                ", encomendas=" + Arrays.toString(encomendas) +
                '}';
    }

    /*
    Metodo Clone
     */
    public Encomenda clone() {
        return new Encomenda(this);
    }

    /*
    (b) método que determina o valor total da encomenda, public double calculaValorTotal()
     */

}
