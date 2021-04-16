package Ficha2;

public class Ex1 {

    // Ex 1a) ler inteiros para um array e depois determinar o valor mínimo desse array.

    public int minimo (int[] a) {
        int min = Integer.MAX_VALUE;
        for (int j=0; j<a.length; j++) {
            if(a[j]<min) {
                min=a[j];
            }
        }
        return min;
    }

    // Ex 1b) ler um array de inteiros e dois índices e determinar o array com os valores entre esses índices.
    // Pré-condiçao: i<f || f>a.length || i<0 ||f<0

    public int[] subArray(int[] a, int i, int f) {
        if (i>f || f>a.length || i<0 || f<0)
            return null;

        int tam = f-i+1;
        int[] res = new int[tam];

        System.arraycopy(a,0,res,0,tam);
        return res;
    }

    /*
     * Ex 1c) ler dois arrays de inteiros e determinar o array com os elementos comuns aos dois arrays.
     */

    private boolean existe(int[] r, int tam, int i) {
        boolean enc = false;
        for(int j=0; j<tam && !enc; j++) {
            enc = r[j] == i;
        }
        return enc;
    }


    public int[] comuns(int[] a1, int[] a2) {
        int[] res = new int[a1.length];
        int cont = 0;

        for(int elem: a1) {
            boolean enc = this.existe(res, cont, elem);
            for(int j=0; j<a2.length && !enc; j++) {
                if(elem==a2[j]) {
                    res[cont++] = elem;
                    enc = true;
                }
            }
        }
        int[] resultado = new int[cont];
        System.arraycopy(res, 0, resultado, 0, cont);

        return resultado;
    }
}
