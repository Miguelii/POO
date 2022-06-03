package Ficha6;

/*
                        Utilizadores
Para cada utilizador guarda-se a seguinte informação pessoal:
    • email, que é a chave do utilizador;
    • password;
    • nome;
    • género;
    • altura;
    • peso;
    • data de nascimento;
    • desporto favorito - que é o desporto em que pratica mais actividades;
    Além desta informação, que deve poder ser editada, o utilizador regista também
a informação das actividades que realizou;
 */

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Utilizador {
    private String email;
    private String password;
    private String nome;
    private String genero;
    private int altura;
    private int peso;
    private LocalDate dataNascimento;
    private Atividade desportoFavorito;

    private List<Atividade> actividades;
    private Map<Atividade,Integer> mapActv;

    public Utilizador(){
        this.email = "";
        this.password = "";
        this.nome = "";
        this.genero = "";
        this.altura = 0;
        this.peso = 0;
        this.dataNascimento = LocalDate.EPOCH;
        this.desportoFavorito = null;
        this.actividades = new ArrayList<>();
    }

    public Utilizador(String email, String password, String nome, String genero, int altura, int peso, LocalDate dataNascimento, Atividade desportoFavorito, List<Atividade> actividades){
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.desportoFavorito = desportoFavorito;

        this.actividades = new ArrayList<>();
        setActividades(actividades);

    }

    public Utilizador(Utilizador a){
        this.email = a.getEmail();
        this.password = a.getPassword();
        this.nome = a.getNome();
        this.genero = a.getGenero();
        this.altura = a.getAltura();
        this.peso = a.getPeso();
        this.dataNascimento = a.dataNascimento;
        this.desportoFavorito = a.desportoFavorito;
        this.actividades = a.getAtividades();
    }


    public List<Atividade> getAtividades() {
        return this.actividades.stream().map(Atividade::clone).collect(Collectors.toList());
    }

    public void setActividades(List<Atividade> actividades) {
        this.actividades = new ArrayList<>();

        for(Atividade e : actividades) {
            this.actividades.add(e.clone());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Atividade getDesportoFavorito() {
        return desportoFavorito;
    }

    public void setDesportoFavorito(Atividade desportoFavorito) {
        this.desportoFavorito = desportoFavorito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilizador that = (Utilizador) o;
        return altura == that.altura && peso == that.peso && desportoFavorito == that.desportoFavorito && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(nome, that.nome) && Objects.equals(genero, that.genero) && Objects.equals(dataNascimento, that.dataNascimento);
    }

    @Override
    public String toString() {
        return "Utilizador{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", dataNascimento=" + dataNascimento +
                ", desportoFavorito=" + desportoFavorito +
                '}';
    }

    public Utilizador clone() {
        return new Utilizador(this);
    }

    public void adicionaAtividade(Atividade act) {
        this.actividades.add(act.clone());

        /*
        if(!this.mapActv.containsKey(act)) this.mapActv.put(act,1);
        else this.mapActv.put(act, mapActv.get(act)+1);
         */
    }

}
