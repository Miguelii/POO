package Ficha4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class CasaInteligente {

    private ArrayList<Lampada> lampadas;

    // Construtores
    public CasaInteligente() {
        this.lampadas = new ArrayList<>();
    }

    public CasaInteligente(ArrayList<Lampada> lampadas) {

        this.lampadas = new ArrayList<>(this.lampadas.size());
        for(Lampada l : this.lampadas) {
            this.lampadas.add(l.clone());
        }
    }

    public CasaInteligente(CasaInteligente e) {
        this.lampadas = e.getLampadas();
    }

    public ArrayList<Lampada> getLampadas() {
        ArrayList<Lampada> res = new ArrayList<>();
        for(Lampada l : this.lampadas) {
            res.add(l.clone());
        }
        return res;
    }

    public void setLampadas(ArrayList<Lampada> lampadas) {
        this.lampadas = new ArrayList<>();
        for(Lampada l : this.lampadas) {
            this.lampadas.add(l.clone());
        }
    }

    @Override
    public String toString() {
        return "CasaInteligente{" +
                "lampadas=" + lampadas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CasaInteligente that = (CasaInteligente) o;
        return that.lampadas.equals(getLampadas());
    }

    public CasaInteligente clone() {
        return new CasaInteligente(this);
    }
    ////

    // i) Adiciona mais uma lampada à casa
    public void addLampada(Lampada l) {
        this.lampadas.add(l.clone());
    }

    // ii) Liga no modo consumo máximo a lampara da posicao index
    public void ligaLampadaNormal(int index) {
        this.lampadas.get(index).lampON();
    }

    // iii) Liga no modo eco a lampara da posicao index
    public void ligaLmapdaEco(int index) {
        this.lampadas.get(index).lampECO();
    }

    // iv) Quantas lampadas estao em modo eco
    public int qtEmEco() {
        int quantas = 0;
        for(Lampada l : lampadas) {
            if(l.getModo() == Lampada.Modo.ECO) quantas++;
        }
        return quantas;

        //OU
        //return (int) this.lampadas.stream().filter(l -> l.getModo() == Lampada.Modo.ECO).count();
    }

    // v) Remove a lampada da posicao index
    public void removeLampada(int index) {
        this.lampadas.remove(this.lampadas.get(index));
    }

    // vi)
    public void ligaTodasEco() {
        for(Lampada l : this.lampadas) {
            l.lampECO();
        }

        //OU
        //this.lampadas.stream().forEach(Lampada::lampECO);
    }

    public void ligaTodasMax() {
        for(Lampada l : this.lampadas) {
            l.lampON();
        }

        //OU
        //this.lampadas.stream().forEach(Lampada::lampON);
    }

    // vii) Consumo total da casa
    public double consumoTotal() {
        double total = 0;
        for(Lampada l : this.lampadas) {
            total += l.totalConsumo();
        }
        return total;
    }

    // viii) Lampada que consumiu mais
    public Lampada maisGastadora() {
        return null;
    }

    // ix) 3 lampadas mais economicas da cas
    public Set<Lampada> podiumEconomia() {
        return null;
    }

    // x) reset do contador parcial de todas as lampadas
    public void reset() {

    }


}
