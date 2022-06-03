package Ficha3;

public class Lampada {
    private boolean mode;
    private boolean estadoON;
    private double consumo;
    private long instanteON;

    private double totalConsumo;
    private double periodoConsumo;

    public Lampada() {
        this.mode = false;
        this.estadoON = false;
        this.consumo = 0;
        this.instanteON = 0;
        this.totalConsumo = 0;
        this.periodoConsumo = 0;
    }

    public Lampada(boolean mode, boolean estadoON) {
        this.mode = mode;
        this.estadoON = estadoON;
        this.consumo = 0;
        this.instanteON = 0;
        this.totalConsumo = 0;
        this.periodoConsumo = 0;
    }

    public Lampada(Lampada e) {
        this.mode = e.isMode();
        this.consumo = e.getConsumo();
        this.instanteON = e.getInstanteON();
        this.totalConsumo = e.getTotalConsumo();
        this.periodoConsumo = e.getPeriodoConsumo();
    }

    public boolean isMode() {
        return mode;
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public long getInstanteON() {
        return instanteON;
    }

    public void setInstanteON(long instanteON) {
        this.instanteON = instanteON;
    }

    public double getTotalConsumo() {
        return totalConsumo;
    }

    public void setTotalConsumo(double totalConsumo) {
        this.totalConsumo = totalConsumo;
    }

    public double getPeriodoConsumo() {
        return periodoConsumo;
    }

    public void setPeriodoConsumo(double periodoConsumo) {
        this.periodoConsumo = periodoConsumo;
    }

    // a)
    public void lampON() {
        if(estadoON) return;
        this.mode = false;
        this.instanteON = System.currentTimeMillis();
        estadoON = true;
    }

    // b)
    public void lampOFF() {
        if(estadoON == false) return;
        this.mode = true;
        this.instanteON = System.currentTimeMillis();
        estadoON = false;
    }

    // c)
    public void lampECO() {
        if(estadoON) return;
        long now = System.currentTimeMillis();
        long periodo = now-instanteON;

        totalConsumo += periodo*consumo;
        periodoConsumo += periodo*consumo;
        estadoON = true;
    }

    // d) igual ao get
    public double totalConsumo() {
        return totalConsumo;
    }

    // e) igual ao get
    public double periodoConsumo() {
        return periodoConsumo;
    }

    public void reset() {
        this.lampOFF();
        this.periodoConsumo = 0;
    }
}
