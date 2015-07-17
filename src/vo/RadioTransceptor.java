package Vo;

public class RadioTransceptor {
    
    
    private String fabricante;
    private String modelo;
    private static String cm;
    private static String numeroSerial;
    
    private static int qtdRadios = 0;

    public RadioTransceptor(String fabricante, String modelo, String numeroSerial, String cm) {
        
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numeroSerial = numeroSerial;
        this.cm = cm;        
        
        qtdRadios++;
    }
    
    public String getCm() {
    	
    	return this.cm;
    }
    
    public String getNumeroSerial() {
    	
    	return this.numeroSerial;
    }
    
    public String getFabricante() {
    	
    	return this.fabricante;
    }
    
    public String getModelo() {
    	
    	return this.modelo;
    }
    
    public String toString() {
    	
    	return "Fabricante: "+this.getFabricante()+"\nModelo: "+this.getModelo()+"\nNúmero Serial: "+this.getNumeroSerial()
    			+"\nPatrimônio: "+this.getCm();
    }
    
    public int retornaQuantidadeDeRadios() {
    	
    	return this.qtdRadios;
    }
}
