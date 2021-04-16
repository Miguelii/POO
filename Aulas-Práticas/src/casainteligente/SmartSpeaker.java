package casainteligente;

import jdk.jshell.Snippet;

public class SmartSpeaker extends SmartDevice {
    public static final int MAX = 20; // volume maximo

    private int volume;
    private String canal;

    /*
    Construtor por omissao
     */
    public SmartSpeaker() {
        this.volume = 10;
    }

    /*
    Construtor parametrizado
     */
    public SmartSpeaker(String s) {
        this.volume = 10;
    }

    public SmartSpeaker(String s, String s1, int i) {
        this.volume = 10;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int v){
        this.volume = v;
    }

    public String getChannel(){
        return this.canal;
    }

    public void setChannel(String c){
        this.canal = c;
    }

    public void volumeUp(){
        this.volume ++;
    }

    public void volumeDown(){
        this.volume --;
    }
}