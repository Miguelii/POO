package Ficha3;

public class Circulo extends Ponto {
    private int raio;
    private Ponto centro;

    public Circulo() {
        this.raio = 0;
        this.centro = new Ponto();
    }

    public Circulo(int raio, Ponto centro) {
        //super(x,y);
        this.centro = centro.clone();
        this.raio = raio;
    }

    public Circulo(Circulo umCirculo) {
        this.centro = umCirculo.getCentro();
        this.raio = umCirculo.getRaio();
    }

    public void setCentro(Ponto centro, int raio) {
        this.centro = centro.clone();
        this.raio = raio;
    }

    public Ponto getCentro() {
        return this.centro.clone();
    }

    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Circulo p = (Circulo) o;
        return (getCentro().equals(this.centro) && this.raio == p.getRaio());
    }

    @Override
    public String toString() {
        return "raio = " + this.raio + "Ponto x = " + getX() + "Ponto y = " + getY();
    }

    public Circulo clone() {
        return new Circulo(this);
    }

    // e)
    public void alteraCentro(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // f)
    public double calculaArea() {
        return (Math.PI * Math.pow(this.raio,2));
    }

    // g)
    public double calculaPerimetro() {
        return ((2*Math.PI) * this.raio);
    }
}
