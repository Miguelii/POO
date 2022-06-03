package Ficha5;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GestaoEncomendas {
    private Map<Integer,Encomenda> encomendas;

    public GestaoEncomendas() {
        this.encomendas = new HashMap<>();
    }

    public GestaoEncomendas(Map<Integer,Encomenda> encomendas) {

        this.encomendas = new HashMap<>();

        for(Encomenda a :encomendas.values()) {
            this.encomendas.put(a.getNEnc(),a.clone());
        }
    }

    public GestaoEncomendas(GestaoEncomendas e) {
        this.encomendas = e.getEncomendas();
    }

    public Map<Integer, Encomenda> getEncomendas() {

        Map<Integer,Encomenda> res = new HashMap<>();

        for(Map.Entry<Integer,Encomenda> e : this.encomendas.entrySet()) {
            res.put(e.getKey(),e.getValue().clone());
        }

        return res;
    }

    public void setEncomendas(Map<Integer, Encomenda> encomendas) {
        this.encomendas = new HashMap<>();
        for(Integer key : encomendas.keySet()) {
            this.encomendas.put(key,encomendas.get(key).clone());
        }
    }

    public GestaoEncomendas clone() {
        return new GestaoEncomendas(this);
    }

    // i)
    public Set<Integer> todosCodigosEnc() {
        return this.encomendas.keySet();
    }

    // ii)
    void addEncomenda(Encomenda enc) {
        this.encomendas.put(enc.getNEnc(),enc.clone());
    }

    // iii)
    public Encomenda getEncomendaG(Integer codEnc) {
        if(!this.encomendas.containsKey(codEnc)) return null;
        else return this.encomendas.get(codEnc).clone();
    }

    // iv)
    public void removeEncomenda(Integer codEnc) {
        this.encomendas.remove(codEnc);
    }

    // v)
    public Integer encomendaComMaisProdutos() {
        Comparator<Encomenda> c = (a1,a2) -> a2.numeroTotalProdutos() - a1.numeroTotalProdutos();

        TreeSet<Encomenda> t = new TreeSet<>(c);

        for(Encomenda e : this.encomendas.values()) {
            t.add(e); //Nao precisamos de clone porque vamos devolver apenas um inteiro
        }

        Encomenda r = t.first();

        return r.getNEnc();

        // Usando streams
        //return this.encomendas.values().stream().sorted(c).map(e -> e.getNEnc()).findFirst().orElse(-1);

    }

    // vi)
    public Set<Integer> encomendasComProduto(String codProd) {

        Set<Integer> res = new HashSet<Integer>();

        for(Encomenda e : this.encomendas.values()) {
            if(e.existeProdutoEncomenda(codProd)){
                res.add(e.getNEnc());
            }
        }
        return res;
    }

    // vii)
    public Set<Integer> encomendasAposData(LocalDate d) {

        return this.encomendas.values().stream().filter(e -> e.getData().isAfter(d)).map(a -> a.getNEnc()).collect(Collectors.toSet());
    }
}
