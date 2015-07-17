package vo;


public abstract class Viatura {
    
    private String prefixoVtr;
    private RadioTransceptor radio;

    public Viatura(String prefixoVtr, RadioTransceptor radio) {
    	
        this.prefixoVtr = prefixoVtr;
        this.radio = radio;
    }
    
    public String getPrefixoVtr() {
    	
    	return this.prefixoVtr;
    }
    
    public String exibeRadios() {
    	
    	return radio.toString();
    }
    
    public abstract String dataDoServico();
}
