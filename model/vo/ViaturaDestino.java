package vo;



public class ViaturaDestino extends Viatura{
    
    public Data dataInstalacao;
    

    public ViaturaDestino(Data dataInstalacao, String prefixoVtr, RadioTransceptor radio) {
        super(prefixoVtr, radio);
        this.dataInstalacao = dataInstalacao;
    }

    

      
    
}
