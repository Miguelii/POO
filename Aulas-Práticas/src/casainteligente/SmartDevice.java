package casainteligente;

public class SmartDevice {
    private String id;
    private boolean on;

    public SmartDevice() {
        this.id = "";
        this.on = false;
    }

    public SmartDevice(String id) {
        this.id = id;
        this.on = false;
    }

    public SmartDevice(String id, boolean b) {
        this.id = id;
        this.on = false;
    }

    public SmartDevice(SmartDevice e) {
        this.id = e.getID();
        this.on = e.getOn();
    }

    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public SmartDevice clone() {
        return new SmartDevice(this);
    }


}

