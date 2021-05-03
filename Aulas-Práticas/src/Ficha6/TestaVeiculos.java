package Ficha6;

import java.util.ArrayList;
import java.util.List;

public class TestaVeiculos {

    public static void main(String[] args) {
        List<Veiculo> lv = new ArrayList<>();

        lv.add(new Veiculo("XPTO", "xpto", "AA 00 AA", 2021,30,10,new ArrayList<>(),0,0));

        lv.add(new VeiculoOcasiao("XPTO", "xpto", "AA 01 AA", 2021,30,10,new ArrayList<Integer>(),0,0,false));

        lv.add(new VeiculoOcasiao("XPTO", "xpto", "AA 02 AA", 2021,30,10,new ArrayList<Integer>(),0,0,false));
    }
}
