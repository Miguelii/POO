package Ficha5;

import Ficha4.EncEficiente;
import java.util.Comparator;

public class EncVTComp implements Comparator<EncEficiente> {

    public int compare(EncEficiente e1, EncEficiente e2) {
        return (int)(e2.calculaValorTotal() - e1.calculaValorTotal());
    }

}
