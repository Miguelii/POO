package Ficha3;

public class Circulo {

    private double x;
    private double y;
    private double raio;

    /*
    Construtor por omissao
     */
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
        //this(0.0,0.0,1.0)
    }

    /*
    Construtor parametrizado
     */
    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;   //Se o raio for negativo? (Mecanismo de Exception)
    }

    /*
    Construtor de copia
     */
    public Circulo(Circulo umCirclo) {
        this.x = umCirclo.getX();
        this.y = umCirclo.getY();
        this.raio = umCirclo.getRaio();
    }
    /*
    Gets e Sets
     */
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getRaio() {
        return this.raio;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /* 1e)
    Metodo que altera o centro do circulo
     */

    public void alteraCentro(double x, double y) {
        this.x = x;
        this.y = y;     // this.setY(y);
    }

    /* 1f)
    Calcula area do circulo
     */

    public double calculaArea() {
        return (Math.PI*Math.pow(this.raio,2));
    }

    /* 1g)
    perimetro do circulo
     */

    public double calculaPerimetro() {
        return (2*Math.PI*this.raio);
    }

    /*
    Metodo que reescreve o equals
     */
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if((o == null) || (this.getClass()) != o.getClass())
            return false;

        Circulo c = (Circulo) o;
        return (this.x==c.getX() && this.y==c.getY() && this.raio==c.getRaio());
    }

    /*
    toString
     */

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Ponto x: "); sb.append(this.x);
        sb.append(", Ponto y: "); sb.append(this.y);
        sb.append(", Raio: "); sb.append(this.raio);

        return sb.toString();
    }

    /*
    Metodo clone
     */

    public Circulo clone() {
        return new Circulo(this);
    }


}
