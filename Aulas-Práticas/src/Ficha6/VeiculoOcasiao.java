package Ficha6;

import java.util.ArrayList;
import java.util.List;

public class VeiculoOcasiao extends Veiculo {

    private boolean promo;
    private static final double desconto = .25;

    public VeiculoOcasiao() {
        super();
        this.promo = false;
    }

    public VeiculoOcasiao(String marca, String modelo, String matricula,
                          int ano, double velociademedia, double precokm,
                          ArrayList<Integer> classificacao,
                          int kms, int kmsUltimo, boolean promo) {

        super(marca,modelo,matricula,ano,velociademedia,precokm,classificacao,kms,kmsUltimo);

        this.promo = promo;

    }

    public VeiculoOcasiao(VeiculoOcasiao v) {
        super(v);
        this.promo = v.getPromo();
    }

    public boolean getPromo() {
        return this.promo;
    }

    public void setPromo(boolean p) {
        this.promo = p;
    }

    public double custoRealKM() {
        /*
        double custoBase = super.custoRealKM();

        if(this.promo) {
            custoBase = custoBase*(1-VeiculoOcasiao.desconto);
        }
        */

        return super.custoRealKM()*(this.promo?(1-VeiculoOcasiao.desconto):1);
    }

    public VeiculoOcasiao clone() {
        return new VeiculoOcasiao(this);
    }

    public boolean equals(Object o) {
        if (o==this) return true;
        if (o == null || !o.getClass().equals(this.getClass())) return false;
        VeiculoOcasiao v = (VeiculoOcasiao) o;
        return super.equals(v) && this.promo==v.getPromo();
    }

    public String toString() {
        return super.toString()+", "+this.promo;
    }
}
