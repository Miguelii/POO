package Ficha6;

public class Episodio {

    private double duracao;
    private int clasif;

    public Episodio() {
        this.duracao = 0;
    }
    public double getDuracao() {
        return this.duracao;
    }

    public int getClasif() {
        return clasif;
    }

    public Episodio clone() {
        return new Episodio();
    }

}
