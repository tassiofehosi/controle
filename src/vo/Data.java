package Vo;

public class Data {
    
    private String dia;
    private String mes;
    private String ano;

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String getDia() {
    	
    	return this.dia;
    }
    
    public String getMes() {
    	
    	return this.mes;
    }
    
    public String getAno() {
    	
    	return this.ano;
    }
}
