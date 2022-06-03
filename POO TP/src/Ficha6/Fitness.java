package Ficha6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Fitness extends Episodio {
    private Map<String, Utilizador> utilizadores;

    private Map<String, List<Episodio>> podcasts;
    private Map<String, List<Episodio>> user;

    public Fitness() {
        this.utilizadores = new TreeMap<>();
    }

    public Fitness(Map<String, Utilizador> utilizadores) {
        this.utilizadores = new TreeMap<>();

        for(Utilizador a : this.utilizadores.values()) {
            this.utilizadores.put(a.getEmail(), a.clone());
        }
    }

    public Fitness(Fitness e) {
        this.utilizadores = e.getUtilizadores();
    }


    public Map<String, Utilizador> getUtilizadores() {

        return this.utilizadores.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
    }

    public void setUtilizadores(Map<String, Atividade> utilizadores) {

        this.utilizadores.entrySet().stream().collect(Collectors.toMap(k->k.getKey(),k->k.getValue().clone()));
    }

    @Override
    public String toString() {
        return "Fitness{" +
                ", utilizadores=" + utilizadores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fitness)) return false;
        Fitness fitness = (Fitness) o;
        return Objects.equals(getUtilizadores(), fitness.getUtilizadores());
    }

    public Fitness clone() {
        return new Fitness(this);
    }

    // a) Verificar existencia de um utilizador dado seu código
    public boolean existeUtilizador(String email) {
        return this.utilizadores.containsKey(email);
    }

    // b) Devolver quantidade de utilizadores existentes
    public int quantos() {
        return this.utilizadores.size();
    }

    // c) Devolver nr total de atividades despotivas de um dado tipo por utilizador
    public int quantos(String actividade, String email) throws UserNotExistException {

        if(!this.utilizadores.containsKey(email)) throw new UserNotExistException("User not exists");

        return (int) this.utilizadores.get(email).getAtividades().stream().filter(k->k.getCodigo().equals(actividade)).count();
    }

    // d) Devolver info de um user dado seu código
    public Utilizador getUtilizador(String email) {
        return this.utilizadores.get(email).clone();
    }

    // e) Adicionar actividade ao registo de um utilizador.
    public void adiciona(String email, Atividade act) {

        this.utilizadores.get(email).getAtividades().add(act);
    }

    // f) Devolver lista com cópia de todas act existentes na aplicação
    public List<Atividade> getAllActividades() {
        List<Atividade> res = new ArrayList<>();


        this.utilizadores.values().stream().map(Utilizador::getAtividades).forEach(x -> res.addAll(x));

        return res.stream().distinct().collect(Collectors.toList());

    }

    // g) Adiciona info de um conjunto de act de um utilizador de outra aplicacao
    public void adiciona(String email, Set<Atividade> activs) {
        Utilizador u = this.utilizadores.get(email);

        for(Atividade e : activs) {
            u.adicionaAtividade(e);
        }
    }

    //h) Nr total de minutos dispendidos por um utilizador em actividades de fitness
    public int tempoTotalUtilizador(String email) {

        return this.utilizadores.get(email).getAtividades().stream().mapToInt(Atividade::getDuracao).sum();
    }

    //i) Devolver a actividade com maior dispêndio de calorias
    public Atividade actividadeMaisExigente() {

        return null;
    }

    //j) Devolver utilizador com maior dispendio calorico
    public Utilizador utilizadorMaisActivo() {
        Comparator<Utilizador> comp = (u1,u2) -> (int) (u1.getAtividades().stream().mapToDouble(Atividade::calorias).sum()
                                                        - u2.getAtividades().stream().mapToDouble(Atividade::calorias).sum());


        return this.utilizadores.values()
                                .stream()
                                .map(v->v.clone())
                                .sorted(comp).findFirst().get().clone();
    }

    //k) Actualizar desporto favorito dos users para aquele que registam mais atividades
    public void actualizaDesportoFav() {

    }

    /* FASE 2 */

    // a) Ordem natural dos user é 1º ordem crescente do seu consumo de calorias e 2º ordem alfabética
    public Set<Utilizador> ordenarUtilizadores() {
        TreeSet<Utilizador> res = new TreeSet<>();

        for(Utilizador e : this.utilizadores.values()) {
            res.add(e.clone());
        }

        return res;
    }

    // b) Igual à alinea a) mas devolve uma list
    public List<Utilizador> ordenarUtilizadoresList() {

        return this.utilizadores.values().stream().map(Utilizador::clone).sorted().collect(Collectors.toList());
    }

    // c) Ordernar dado um comparator
    public Set<Utilizador> ordenarUtilizador(Comparator<Utilizador> c) {

        return this.utilizadores.values().stream().map(Utilizador::clone).sorted(c).collect(Collectors.toCollection(TreeSet::new));
    }

    // d) Guardar comparadores

    private static final Map<String,Comparator<Utilizador>> comparadores = new HashMap<>();

    public static Comparator<Utilizador> getComparator(String criterio) {
        return comparadores.get(criterio);
    }

    public static void addComparator(String criterio, Comparator<Utilizador> comprator) {
        comparadores.put(criterio,comprator);
    }


    // e) obter iterador de Utilizador, ordenado de acordo com o critério
    public Iterator<Utilizador> ordenarUtilizador(String criterio) {
        List<Utilizador> res;
        Comparator<Utilizador> comp = comparadores.get(criterio);

        res = this.utilizadores.values().stream().map(Utilizador::clone).sorted(comp).collect(Collectors.toList());

        return res.iterator();
    }

    // f) Obter Map que associa cada atividade dos seus top3 users com mais calorias queimadas nessa atividade
    //ordenados decrescente por calorias. A chave do Map será o nome dessa atividade
    public Map<String,List<Utilizador>> podiumPorActiv() {

        Map<String,List<Utilizador>> res = new HashMap<>();


        for(String e : this.utilizadores.keySet()) {
            res.putIfAbsent(e,new ArrayList<>());
        }

        return null; //(INC)...
    }


}
