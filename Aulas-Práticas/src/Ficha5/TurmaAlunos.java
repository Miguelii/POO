package Ficha5;

public class TurmaAlunos {

    private String nome;
    private String codigo;

    public TurmaAlunos() {
        this.nome = "";
        this.codigo = "";
    }

    public TurmaAlunos(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public TurmaAlunos(TurmaAlunos e) {
        this.nome = e.getNome();
        this.codigo = e.getCodigo();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Nome: ");
        sb.append(this.nome+"\n");
        sb.append("Codigo UC: ");
        sb.append(this.codigo+"\n");

        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;

        if((o == null) || (this.getClass() != o.getClass()))
            return false;

        TurmaAlunos e = (TurmaAlunos) o;

        return(this.nome.equals(e.getNome()) && this.codigo.equals(e.getCodigo()));
    }

    public TurmaAlunos clone() {
        return new TurmaAlunos(this);
    }
}

    // ii)
