package Ficha4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncEficiente {

    private String nome;
    private String nif;
    private String morada;
    private String numeroEncomenda;
    private ArrayList<LinhaEncomenda> linha;
    private LocalDate data;

    /*
    Construtor por omissao
     */
    public EncEficiente() {
        this.nome = " ";
        this.nif = " ";
        this.morada = " ";
        this.numeroEncomenda = " ";
        this.linha = new ArrayList<>();
        this.data = LocalDate.now();
    }

    /*
    Construtor parametrizado
     */
    public EncEficiente(String nome, String nif, String morada, String numeroEncomenda, ArrayList<LinhaEncomenda> linha, LocalDate data) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.numeroEncomenda = numeroEncomenda;
        this.linha = new ArrayList<>(linha);
        this.data = data;
    }

    /*
    Construtor de copia
     */
    public EncEficiente(EncEficiente e) {
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.numeroEncomenda = e.getNumeroEncomenda();
        this.data = e.getData();
        this.linha = e.getLinha();
    }

    /*
    Getters and Setters
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNumeroEncomenda() {
        return numeroEncomenda;
    }

    public void setNumeroEncomenda(String numeroEncomenda) {
        this.numeroEncomenda = numeroEncomenda;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    /*
    Stream corre tudo
    Map aplica a cada objeto uma funçao
     */
    public ArrayList<LinhaEncomenda> getLinha() {
        ArrayList<LinhaEncomenda> re = this.linha.stream().map(LinhaEncomenda::clone).collect(Collectors.toCollection(ArrayList<LinhaEncomenda>::new));

        return re;
    }

    public void setLinha(List<LinhaEncomenda> linha) {
        this.linha.clear();
        for(LinhaEncomenda t: linha) {
            this.linha.add(t.clone());
        }
    }

    /*
    Metodo toString
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do cliente: ").append(getNome());
        sb.append("\nNif: ").append(getNif());
        sb.append("\nMorada: ").append(getMorada());
        sb.append("\nNumero da encomenda: ").append(getNumeroEncomenda());
        //sb.append("\nLinhaEncomenda: ").append(getLinha());


        for (LinhaEncomenda a: this.linha) {
            sb.append(a.toString());
        }


        return sb.toString();
    }

    /*
    Metodo equals
     */
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EncEficiente le = (EncEficiente) obj;
        return le.getNome().equals(this.nome) &&
                le.getMorada().equals(this.morada) &&
                le.getNif().equals(this.nif) &&
                le.getNumeroEncomenda().equals(this.numeroEncomenda) &&
                le.getLinha().equals(this.linha);
    }

    /*
    Metodo clone
     */
    public EncEficiente clone() {
        return new EncEficiente(this);
    }

    /*
    método que determina o valor total da encomenda
     */
    public double calculaValorTotal() {

        /*
        double valor = 0;
        for(LinhaEncomenda t: this.linha) {
            valor += t.calculaValorLinhaEnc();
        }
        return valor;
        */

        return this.linha.stream().mapToDouble(LinhaEncomenda::calculaValorLinhaEnc).sum();
    }

    /*
    método que determina o valor total dos descontos obtidos nos diversos produtos encomendados
     */
    public double calculaValorDesconto() {

        /*
        double valor = 0;
        for(LinhaEncomenda t: this.linha) {
            valor += t.calculaValorDesconto();
        }
        return valor;
        */

        return this.linha.stream().mapToDouble(LinhaEncomenda::calculaValorDesconto).sum();
    }

    /*
    método que determina o número total de produtos a receber
     */
    public int numeroTotalProdutos() {

        /*
        int quantidade = 0;
        for(LinhaEncomenda t: this.linha) {
            quantidade += t.getQuantidade();
        }
        return quantidade;
        */

        return this.linha.stream().mapToInt(LinhaEncomenda::getQuantidade).sum();
    }

    /*
    método que determina se um produto vai ser encomendado
     */
    public boolean existeProdutoEncomenda(String refProduto) {

        return this.linha.stream().anyMatch(n->n.getReferencia().equals(refProduto));
    }

    /*
    método que adiciona uma nova linha de encomenda
     */
    public void adicionaLinha(LinhaEncomenda linha) {
        this.linha.add(linha.clone());
    }

    /*
    método que remove uma linha de encomenda dado a referência do produto
     */
    public void removeProduto(String codProd) {
        this.linha.removeIf(n->n.getReferencia().equals(codProd));  //Nao precisamos do stream porque o removeif já percorre a coleçao
    }

}
