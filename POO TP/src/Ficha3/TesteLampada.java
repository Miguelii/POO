package Ficha3;

public class TesteLampada {
    public static void main(String[] args) {

        Lampada l1 = new Lampada(false,false);

        long tempoAntes = System.currentTimeMillis();
        l1.lampON();

        long tempofinal = l1.getInstanteON() - tempoAntes;
        System.out.println(tempofinal);

    }
}
