package Ficha5;

import java.util.*;

/*
public class TurmaAlunos {
    private Map<String, Aluno> alunos;
    private String nomeTurma;
    private String codUC;

    public TurmaAlunos() {
        this.nomeTurma = " ";
        this.codUC = " ";
        this.alunos = new HashMap<>();
        //this.alunos = new TreeMap<>();
    }

    public TurmaAlunos(Map<String, Aluno> alunos, String nomeTurma, String codUC) {
        this.nomeTurma = nomeTurma;
        this.codUC = codUC;

        //Composiao
        this.alunos = new HashMap<>();

        //1º forma
        for (Aluno a : alunos.values()) {
            String chave = a.getNumero();
            this.alunos.put(chave, a.clone());
        }
    }

    public TurmaAlunos(TurmaAlunos e) {
        this.alunos = e.getAlunos();
        this.nomeTurma = e.getNomeTurma();
        this.codUC = e.getCodUC();
    }

    public Map<String, Aluno> getAlunos() {

        Map<String, Aluno> res = new HashMap<>();

        for (Map.entry(String, Aluno) e :this.alunos.entrySet()){
            String chave = e.getKey();
            Aluno valor = e.getValue();
            res.put(chave, valor.clone());
        }
        return res;
    }

    public void setAlunos(Map<String, Aluno> nralunos) {
        this.alunos = new HashMap<>();

        for (String key : nralunos.keySet()) {
            this.alunos.put(k, nralunos.get(k).clone);
        }
    }

    public String getNomeTurma() {
        return this.nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getCodUC() {
        return this.codUC;
    }

    public void setCodUC(String codUC) {
        this.codUC = codUC;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TurmaAlunos that = (TurmaAlunos) o;
        return this.alunos.equals(that.getAlunos()) && this.codUC.equals(that.getCodUC()) && this.nomeTurma.equals(that.getNomeTurma());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome Turma: ").append(this.getNomeTurma()).append("\n")
                .append("CodUC: ").append(this.getCodUC()).append("\n");

        for (Aluno a : this.alunos.values()) {
            sb.append(a.toString()).append("\n");
        }

        return sb.toString();
    }

    public TurmaAlunos clone() {
        return new TurmaAlunos(this);
    }

    // ii)
    public void insereAluno(Aluno a) {
        this.alunos.put(a.getNumero(), a.clone());
    }

    // iii)
    public Aluno getAluno(String codAluno) {
        if (!this.alunos.containsKey(codAluno)) return null;
        else return this.alunos.get(codAluno).clone();
    }

    // iv)
    public void removeAluno(String codAluno) {
        this.alunos.remove(codAluno);
    }

    // v)
    public Set<String> todosOsCodigos() {
        return this.alunos.keySet();
    }

    // vi)
    public int qtsAlunos() {
        return this.alunos.size();
    }



    public class Aluno implements Comparable<Aluno> {
        ...
        public int compareTo(Aluno a) {
            // >0 se this > a
            // ==0 se this == a
            // <0 se this < a

            return this.nome.compareTo(a.getNome());
        }
    }


    // vii)

    public Collection<Aluno> alunosOrdemAlfabetica() {
        TreeSet<Aluno> t = new TreeSet<>();

        for (Aluno a : this.alunos.values()) {
            t.add(a.clone()); //Insert ordenado por causa do TreeSet
        }
        return t;
    }

    // viii)

    public Set<Aluno> alunosOrdemDescrescenteNumero() {
        Comparator<Aluno> c = (a1,a2) -> a2.getNumero().compareTo(a1.getNumero()); // a2 a1 decrescente  || a1 a2 crescente

        TreeSet<Aluno> t = new TreeSet<Aluno>(c);

        for (Aluno a : this.alunos.values()) {
            t.add(a.clone()); //Insert ordenado por causa do TreeSet
        }
        return t;


    }
}
*/
