package Ficha1;
import java.util.Scanner;

public class Ficha1 {

    public double celsiusParaFarecheit(double graus) {
        return graus*1.8+32;
    }

    public int maximoNumeros(int a, int b) {
        return Math.max(a,b);
    }

 /* 3. Ler um nome (String) e um saldo (decimal) e imprimir um texto com os valores obtidos na
leitura.
*/

    public String criaDescricaoConta(String nome, double saldo) {
        return "Nome: " + nome + "\n Saldo: " + saldo;
    }

    /* Ex 6
     *
     */

    public long factorial(int num) {
        long fact = 1;

        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }

    /* Ex 7
     *
     */
    public long tempoGasto() {
        long antes = System.currentTimeMillis();
        this.factorial(5000);
        long depois = System.currentTimeMillis();
        return depois-antes;
    }
}
