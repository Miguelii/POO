package Ficha3;

import java.util.Objects;

public class triangulo {

    /*
    9. Um Triângulo é definido por três pontos no espaço 2D. Crie a classe
    correspondente, especificando os métodos:
     */

    // Composiçao -> nao é partilhado com ninguem
    // Agregaçao -> Os pontos podem ser partilhados

    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    /*
    Construtor por omissao
     */
    public triangulo() {
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
    }

    /*
    Construtor Parametrizado
     */
    public triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1.clone();  //Clone porque queremos composiçao (Nao partilhar nada)
        this.p2 = p2.clone();
        this.p3 = p3.clone();
    }

    /*
    Construtor de copia
     */
    public triangulo(triangulo t) {
        this.p1 = t.getP1();
        this.p2 = t.getP2();
        this.p3 = t.getP3();
    }
    /*
    Gets e Sets
     */
    public Ponto getP1() {
        return this.p1.clone();
    }

    public void setP1(Ponto p) {
        this.p1 = p.clone();
    }

    public Ponto getP2() {
        return this.p2.clone();
    }

    public void setP2(Ponto p) {
        this.p2 = p.clone();
    }

    public Ponto getP3() {
        return this.p3.clone();
    }

    public void setP3(Ponto p) {
        this.p3 = p.clone();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Triangulo: ");
        sb.append(this.p1.toString());
        sb.append(" / ");
        sb.append(this.p2.toString());
        sb.append(" / ");
        sb.append(this.p3.toString());

        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o==null) || (this.getClass() != o.getClass())) return false;

        triangulo t = (triangulo) o;

        return this.p1.equals(t.getP1()) && this.p2.equals(t.getP2()) && this.p3.equals(t.getP3());
    }

    public triangulo clone() {
        return new triangulo(this);
    }

    /*
    (b) método que calcula a área do triângulo, public double
    calculaAreaTriangulo()
     */


    /*
    (c) método que calcula o perímetro do triângulo, public double
    calculaPerimetroTriangulo()
     */
    public double calculaPerimetroTriangulo() {
        return p1.distancia(p2)+p2.distancia(p3)+p3.distancia(p1);
    }

    /*
    (d) método que calcula a altura do triângulo, definido como sendo a
    distância no eixo dos y entre o ponto com menor coordenada em y e
    o ponto com maior coordenada.
     */

}
