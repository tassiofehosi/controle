package vo;



public class ViaturaOrigem extends Viatura{
    
    public Data dataDesinstalacao;
    

    public ViaturaOrigem(Data dataDesinstalacao, String prefixoVtr, RadioTransceptor radio) {
        super(prefixoVtr, radio);
        this.dataDesinstalacao = dataDesinstalacao;
    }

        
    
    
}
