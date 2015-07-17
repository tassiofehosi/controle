package vo;


public class ViaturaOrigem extends Viatura{
    
    private Data dataDesinstalacao;
    private Batalhao batalhaoOrigem;
    
    public ViaturaOrigem(String prefixoVtr, RadioTransceptor radio, Data dataDesinstalacao,
    		Batalhao batalhaoOrigem) {
    	
        super(prefixoVtr, radio);
        this.dataDesinstalacao = dataDesinstalacao;
        this.batalhaoOrigem = batalhaoOrigem;
    }
    
    public void exibeRadioDesinstalado() {
    	
    	System.out.println(""+exibeRadios());
    	System.out.println("Viatura de Origem: "+getPrefixoVtr());
    	System.out.println("BPM: "+batalhaoOrigem.getNome());
    	System.out.println("Data Retirada: "+dataDoServico());
    }
   
    public String toString() {
    	
    	return this.dataDoServico()+"\nViatura Origem: "+this.getPrefixoVtr()+"\nBatalhao Origem: "+this.batalhaoOrigem;
    }
    
    @Override
    public String dataDoServico() {
    	
    	return "\nData Desinstalação: "+this.dataDesinstalacao.getDia()+"/"+this.dataDesinstalacao.getMes()+"/"
    			+this.dataDesinstalacao.getAno();
    }
}
