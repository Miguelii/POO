package Ficha2;

public class Ex2 {

    private int[][] notasTurma;

    /**
     * Construtor vazio
     */
    public Ex2() {  //mudar nome do ficheiro
        this.notasTurma = new int[5][5];
    }

    public void setNotasTurma(int[][] notas) {
        for(int i=0; i<notasTurma.length; i++)
            for(int j=0; j<notasTurma.length; j++)
                notasTurma[i][j] = notas[i][j];

        //this.notasTurma = notas;
    }

    public int[][] getNotasTurma() {
        return this.notasTurma;
    }

    // 2c)

    public float mediaAluno(int nmrAl) {
        int soma = 0;

        for(int i=0; i<this.notasTurma.length; i++) {
            soma += notasTurma[nmrAl][i];
        }
        return soma/(float)this.notasTurma.length;
    }

    //2d)
}
