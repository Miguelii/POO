package Ficha3;

public class Futebol {

    private static final int POR_INICIAR = 0;
    private static final int A_DECORRER = 1;
    private static final int TERMINADO = -1;

    private int estado;
    private int golosvisitado;
    private int golosvisitante;

    /*
    Construtor por omissao
     */
    public Futebol() {
        this.estado = POR_INICIAR;
        this.golosvisitado = 0;
        this.golosvisitante = 0;
    }

    /*
    Construtor parametrizado
     */
    public Futebol(int estado, int golosvisitado, int golosvisitante) {
        this.estado = estado;
        this.golosvisitado = golosvisitado;
        this.golosvisitante = golosvisitante;
    }

    /*
    Construtor de Copia
     */
    public Futebol(Futebol umFutebol) {
        this.estado = umFutebol.getEstado();
        this.golosvisitado = umFutebol.getGolosvisitado();
        this.golosvisitante = umFutebol.getGolosvisitante();
    }

    /*
    Gets e Sets
     */
    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getGolosvisitado() {
        return this.golosvisitado;
    }

    public void setGolosvisitado(int golosvisitado) {
        this.golosvisitado = golosvisitado;
    }

    public int getGolosvisitante() {
        return this.golosvisitante;
    }

    public void setGolosvisitante(int golosvisitante) {
        this.golosvisitante = golosvisitante;
    }

    /*
    (a) método que dá início ao jogo, public void startGame()
     */
    public void startGame() {
        setEstado(A_DECORRER);
    }

    /*
    (b) método que termina o jogo, public void endGame()
     */
    public void endGame() {
        setEstado(TERMINADO);
    }

    /*
    (c) método que adiciona um golo à equipa visitada, public void goloVisitado()
     */
    public void goloVisitado() {
        setGolosvisitado(getGolosvisitado() + 1);
    }

    /*
    (d) método que adiciona um golo à equipa visitante, public void goloVisitante()
     */
    public void goloVisitante() {
        setGolosvisitante(getGolosvisitante() + 1);
    }

    /*
    (e) método que devolve o resultado actual do jogo, public String resultadoActual()
     */
    public String resultadoActual() {
        StringBuffer sb = new StringBuffer();

        sb.append("Equipa da casa: " + getGolosvisitado());
        sb.append("Equipa de fora: " + getGolosvisitante());

        return sb.toString();
    }

    /*
    Metodo toString
     */
    public String toString() {
        return "{" +
                " estado='" + getEstado() + "'" +
                ", golosvisitado='" + getGolosvisitado() + "'" +
                ", golosvisitante='" + getGolosvisitante() + "'" +
                "}";
    }

    /*
    Metodo Clone
     */
    public Futebol clone() {
        return new Futebol(this);
    }
}
