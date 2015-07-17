package vo;


public class RadioTransceptor {
    
    public int cm;
    public String numeroSerial;
    public String fabricante;
    public String modelo;
    public final int qntRadio=0;

    public RadioTransceptor(int cm, String numeroSerial, String fabricante, String modelo) {
        this.cm = cm;
        this.numeroSerial = numeroSerial;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    
    
}
