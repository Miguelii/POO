package Ficha5;

import Ficha4.EncEficiente;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GestaoEncomendas {

    private Map<String, EncEficiente> encomendas;

    public GestaoEncomendas() {
        this.encomendas = new HashMap<>();
    }

    public GestaoEncomendas(Map<String,EncEficiente> encs) {
        //this.encomendas = encs.values().stream().collect(Collectors.toMap((e) -> e.getNEnc(),(e) -> e.clone(),(e1,e2) -> e1, HashMap::new));
        this.encomendas = encs.values().stream().collect(Collectors.toMap(e -> e.getNumeroEncomenda(),e -> e.clone()));

        /* Percorrer pelo entrySet
        this.encomendas = new HashMap<>();
        for(Map.Entry<Integer,Encomenda> e: encs.entrySet()) {
            this.encomendas.put(e.getKey(), e.getValue().clone());
        }
        */

        /* Percorrer pelo values
        for(Encomenda enc: encs.values()) {
            this.encomendas.put(enc.getNEnc(), enc.clone());
        }
        */

        /* Pior soluçao para este caso
        for(Integer i: enc.keySet()) {
            this.encomendas.put(i,encs.get(i).clone());
        }
        */
    }

    public GestaoEncomendas(GestaoEncomendas ge) {
        this.encomendas = ge.getEncomendas();
    }

    public Map<String,EncEficiente> getEncomendas() {
        return this.encomendas.values().stream().collect(Collectors.toMap((e) -> e.getNumeroEncomenda(),(e) -> e.clone()));
    }

    // a)
    public Set<String> todosCodigosEnc() {
        return new TreeSet<String>(this.encomendas.keySet());
    }

    // b)
    public void addEncomenda(EncEficiente enc) {
        this.encomendas.put(enc.getNumeroEncomenda(), enc.clone());

        //this.encomendas.putIfAbsent(enc.getNEnc(), enc.clone());
    }

    // c)
    public EncEficiente getEncomenda(String codEnc) {
        return (this.encomendas.get(codEnc)).clone();
    }

    // d)
    public void removeEncomenda(String codEnc) {
        this.encomendas.remove(codEnc);
    }

    // e)
    public String encomendaComMaisProdutor() {
        Comparator<EncEficiente> comp = (e1,e2) -> (e1.numeroTotalProdutos()) - (e2.numeroTotalProdutos());
        TreeSet<EncEficiente> aux = new TreeSet<>(comp);

        aux.addAll(this.encomendas.values()); // porque nao estamos a partilhar aux com ninguem

        return (aux.last()).getNumeroEncomenda();
    }

    // f)
    public Set<String> encomendasComProduto(String codProd) {
        return this.encomendas.values().stream()
                                       .filter(e -> e.existeProdutoEncomenda(codProd))
                                       .map(EncEficiente::getNumeroEncomenda)
                                       .collect(Collectors.toSet());
    }

    // g)
    public Set<String> encomendasAposData(LocalDate d) {
        return this.encomendas.values().stream()
                                       .filter(e -> e.getData().isAfter(d))
                                       .map(EncEficiente::getNumeroEncomenda)
                                       .collect(Collectors.toSet());
    }

    // h)

    public Set<EncEficiente> encomendasValorDecrescente() {
        Comparator<EncEficiente> comp = new EncVTComp(); //(e1,e2) -> (int)(e2.calculaValorTotal() - e1.calculaValorTotal());
        TreeSet<EncEficiente> aux = new TreeSet<EncEficiente>(comp);

        for (EncEficiente e: this.encomendas.values())
            aux.add(e.clone());

        return aux;
    }

    public Collection<EncEficiente> encomendasValorDecrescenteSafeExt() {
        List<EncEficiente> aux = new ArrayList<>();

        for (EncEficiente e: this.encomendas.values()) {
            aux.add(e.clone());
        }
        aux.sort(new EncVTComp());          //(e1,e2) -> (int)(e2.calculaValorTotal() - e1.calculaValorTotal());
        return aux;
    }

    public Collection<EncEficiente> encomendassValorDecrescenteSafeInt() {
        return this.encomendas.values().stream().map(EncEficiente::clone)
                                                .sorted(new EncVTComp())    //(e1,e2) -> (int)(e2.calculaValorTotal() - e1.calculaValorTotal())
                                                .collect(Collectors.toList());
    }

    // i)




}
