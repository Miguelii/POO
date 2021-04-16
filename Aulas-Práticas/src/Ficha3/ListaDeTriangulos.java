package Ficha3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeTriangulos {

    private List<triangulo> lst;

    public ListaDeTriangulos() {
        this.lst = new ArrayList<>();
    }

    public ListaDeTriangulos(List<triangulo> nlist) {
        this();

        for(triangulo t: nlist) {
            this.lst.add(t.clone());
        }
    }

    public ListaDeTriangulos(ListaDeTriangulos l) {
        this();

        for(triangulo t: l.getLst()) {
            this.lst.add(t);     //pORQUE O GETlst JÁ ME DÁ UMA COPIA
        }
    }

    public List<triangulo> getLst() {
        List<triangulo> re = new ArrayList<triangulo>();


        for(triangulo t: this.lst) {
            re.add(t.clone());
        }

        //this.lst.forEach(t -> re.add(t.clone()));

        return re;
    }

    public void setLst(List<triangulo> l) {
        this.lst.clear();

        for (triangulo t: l) {
            this.lst.add(t.clone());
        }

    }

    public double somPerimetrios() {
        double res=0;

        for(triangulo t: lst) {
            res += t.calculaPerimetroTriangulo();
        }

        return res;
    }



    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;

        ListaDeTriangulos lt = (ListaDeTriangulos) o;
        return this.lst.equals(lt.getLst());
    }

    public String toString() {
        return "ListaDeTriangulos: " + this.lst.toString();
    }

    public ListaDeTriangulos clone() {
        return new ListaDeTriangulos(this);
    }

    public double somPerimetros() {
        double res = this.lst.stream().mapToDouble(triangulo::calculaPerimetroTriangulo).sum();

        return res;
    }

    public boolean temPerimetroMaiorQue(double per) {
        return this.lst.stream().anyMatch(t->t.calculaPerimetroTriangulo()>per);
        /*
        boolean enc = false;
        Iterator<triangulo> it = this.lst.iterator();

        while (it.hasNext() && !enc) {
            triangulo t = it.next();
            enc = t.calculaPerimetroTriangulo()>per;
        }

        return enc;
         */
    }
}
