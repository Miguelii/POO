package casainteligente;

public class SmartBulb extends SmartDevice {

    public static final int WARM = 2;
    public static final int NEUTRAL = 1;
    public static final int COLD = 0;

    private int tone;

    /*
    Construtor por omissao
     */
    public SmartBulb() {
        super();
        this.tone = NEUTRAL;
    }

    /*
    Construtor parametrizado
     */
    public SmartBulb(String id, int tone) {
        super(id);
        this.tone = tone;
    }

    public SmartBulb(String id) {
        super(id);
        this.tone = NEUTRAL;
    }

    /*
    Construtor de copia
     */
    public SmartBulb(SmartBulb e) {
        this.tone = e.getTone();
    }

    /*
    Getters and Setters
     */

    public void setTone(int t) {
        if(t>WARM) this.tone = WARM;
        else if (t<COLD) this.tone = COLD;
        else this.tone = t;
    }

    public int getTone() {
        return this.tone;
    }

    public SmartBulb clone() {
        return new SmartBulb(this);
    }

}
