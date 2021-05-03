package Ficha6;

import java.util.*;
import java.util.stream.Collectors;

public class DriveIt {

    public Map<String, Veiculo> frota;
    private String nome;


    public DriveIt() {
        this.frota = new HashMap<>();
        this.nome = "n/d";
    }

    public DriveIt(String nome, Map<String, Veiculo> frota) {
        this.nome = nome;
        this.setFrota(frota);
    }

    public DriveIt(DriveIt e) {
        //this(drvit.getNome(), drvit.getFrota());  // vamos copiar a estrutura 2 vezes
        this.nome = e.getNome();
        this.frota = e.getFrota();
    }

    public void setFrota(Map<String, Veiculo> f) {
        this.frota = f.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
    }

    public Map<String, Veiculo> getFrota() {
        return this.frota.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // a) Verificar a existência de um veículo, dado o seu código (matricula)

    public boolean existeVeiculo(String cod) {
        return this.frota.containsKey(cod);
    }


    // b) Devolver a quantidade de veículos existentes na empresa de aluguer.

    //public int quantos(){}


    // c) Devolver o número total de veículos de uma dada marca.
    public int quantos(String marca) {
        return (int) this.frota.values().stream().filter(v->v.getMarca().equals(marca)).count();
    }


    // d) Devolver a informação de um veículo, dado o seu código.

    public Veiculo getVeiculo(String cod) {
        Veiculo v = this.frota.get(cod).clone();
        return v!=null ? v.clone() : v;
    }


    // e) Adicionar um novo veículo

    public void adiciona(Veiculo v) {
        this.frota.put(v.getMatricula(), v.clone());
    }


    // f) Devolver uma lista contendo a cópia de todos os veículos no sistema

    public List<Veiculo> getVeiculos() {

    }


    // g) Adicionar a informação de um conjunto de veículos que foram adquiridos e passam agora a fazer parte da empresa.

    public void adiciona(Set<Veiculo> vs) {
        for (Veiculo v: vs) {
            this.adiciona(v);
        }
    }


    // h) Registar um aluguer de um veículo e indicar o número de kms que foram feitos por um cliente.

    public void registarAluguer(String codVeiculo, int numKms) {
        Veiculo v = this.getVeiculo(codVeiculo);

        v.addViagem(numKms);

    }


    // i) Classificar um veículo quando o cliente termina o aluguer.

    public void classificarVeiculo(String cod, int classificacao) {

    }


    // j) Calcula o custo real por km de um veículo de acordo com a regra enunciada anteriormente.

    public int custoRealKm(String cod) {

    }



    // -- 3 --

    // g) Devolver uma lista dos veículos ordenados decrescentemente pelo valor do custo real por km

    public List<Veiculo> veiculosOrdenadosCusto() {
        Comparator<Veiculo> comp = (v1, v2) -> (int) (v1.custoRealKM() - v2.custoRealKM());
        return this.frota.values().stream().sorted(comp).collect(Collectors.toList());
    }

}
