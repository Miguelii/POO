package casainteligente;

/*
A classe CasaInteligente, para além de registar a sua morada, deve permitir registar objectos SmartDevice.
Cada SmartDevice é identificado por um identificador e tem um estado (ligado/desligado).
A classe CasaInteligente deve permitir, ainda, registar a localização dos SmartDevice dentro da casa
(a cada nome de divisão deverá estar associada uma lista de identificadores de SmartDevice).
 */

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CasaInteligente {

    private String morada;
    private Map<String, SmartDevice> device;
    private Map<String, List<String>> locations;

    /*
     * Constructores para a classe CasaInteligente
     */
    public CasaInteligente() {
        this.morada = "";
        this.device = new HashMap<>();
        this.locations = new HashMap<>();
    }

    public CasaInteligente(String morada) {
        this.morada = morada;
        this.device = new HashMap<>();
        this.locations = new HashMap<>();
    }

    public CasaInteligente(CasaInteligente e) {
        this.morada = e.getMorada();
        this.device = e.getDevices();
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Map<String, SmartDevice> getDevices() {
        return this.device.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().clone()));
    }

    public SmartDevice getDevice(String id) {
        SmartDevice k = new SmartDevice();
        for (SmartDevice s : this.device.values()){
            if(id.equals(s.getID())){
                k =  s;
            }
        }
        return k;
    }

    public Map<String, List<String>> getLocations() {
        return this.locations.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public boolean existsDevice(String id) {
        return this.device.values().stream().anyMatch(e -> e.getID().equals(id));
    }

    public void addDevice(SmartDevice s){
            this.device.putIfAbsent(s.getID(),s.clone());
    }

    public boolean hasRoom(String nome) {
        return this.locations.containsKey(nome);
    }

    public void addRoom(String nome) {
        List<String> devs = new ArrayList<>();
        this.locations.put(nome,devs);
    }

    public void addToRoom(String nome, String id) {
        if (!hasRoom(nome)) {
            this.locations.put(nome,new ArrayList<>());
        }
        this.locations.get(nome).add(id);

    }

    public boolean roomHasDevice(String nome, String id) {
        boolean ret = false;
        if (!hasRoom(nome)) {
            return false;
        }
        ret = this.locations.values().stream().anyMatch(e->e.contains(id));
        return ret;
    }

    public void setAllOn(boolean b) {
        this.device.values().forEach(s -> s.setOn(b));
    }

}
