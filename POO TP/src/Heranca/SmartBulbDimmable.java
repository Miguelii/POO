package Heranca;

public class SmartBulbDimmable extends SmartDevice {

    private double intensidade;

    public SmartBulbDimmable() {
        this.intensidade = 0;
    }

    public SmartBulbDimmable(String id, double intensidade, double consumoPorHora) {
        super(id,consumoPorHora);
        consumoPorHora = consumoPorHora/2;
        this.intensidade = 0.5;
    }



}
