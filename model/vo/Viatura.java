package vo;



public abstract class Viatura {
    
    public String prefixoVtr;
    public RadioTransceptor radio;

    public Viatura(String prefixoVtr, RadioTransceptor radio) {
        this.prefixoVtr = prefixoVtr;
        this.radio = radio;
    }
     
}
