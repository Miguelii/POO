package Ficha3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ColCirculo {
    private List<Circulo> circulos;

    public ColCirculo() {
        this.circulos = new ArrayList<>();
    }

    public ColCirculo(List<Circulo> circulos) {
        this.circulos = new ArrayList<>(circulos.size());
        for(Circulo c: circulos) {
            this.circulos.add(c.clone());
        }
    }

    public ColCirculo(ColCirculo c) {
        this.circulos = c.getCirculos();
    }

    public List<Circulo> getCirculos() {
        List<Circulo> res = new ArrayList<>();
        for(Circulo c : this.circulos) {
            res.add(c.clone());
        }
        return res;
    }

    public void setCirculos(List<Circulo> circulos) {
        this.circulos = new ArrayList<>();
        for(int i=0; i<circulos.size();i++) {
            Circulo c = circulos.get(i);
            this.circulos.add(c.clone());
        }
    }

    public int numeroCirculos() {
        return this.circulos.size();
    }

    public boolean existeCirculos(Circulo c) {
        return this.circulos.contains(c);
    }

    public void addCirculo(Circulo c) {
        this.circulos.add(c.clone());
    }

    public void removeCirculo(Circulo c) {
        this.circulos.remove(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        ColCirculo that = (ColCirculo) o;
        return this.circulos.equals(that.getCirculos());
    }

    @Override
    public String toString() {
        return "ColCirculo{" +
                "circulos=" + circulos +
                '}';
    }

    public ColCirculo clone() {
        return new ColCirculo(this);
    }
}
