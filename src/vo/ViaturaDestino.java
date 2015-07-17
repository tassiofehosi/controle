package Vo;

public class ViaturaDestino extends Viatura{
    
    private Data dataInstalacao;
    private Batalhao batalhaoDestino;
    
    public ViaturaDestino(String prefixoVtr, RadioTransceptor radio, Data dataInstalacao,
    		Batalhao batalhaoDestino) {
    	
        super(prefixoVtr, radio);
        this.dataInstalacao = dataInstalacao;
        this.batalhaoDestino = batalhaoDestino;
    }
    
    public void exibeRadioInstalado() {
    	
    	System.out.println(""+exibeRadios());
    	System.out.println("Viatura de Destino: "+getPrefixoVtr());
    	System.out.println("BPM: "+batalhaoDestino.getNome());
    	System.out.println("Data Instalação: "+dataDoServico());
    }
    
    public String toString() {
    	
    	return "\nData da Instalação: "+this.dataDoServico()+"\nViatura Destino: "+this.getPrefixoVtr()+"\nBatalhao Destino: "+this.batalhaoDestino;
    }
    
    @Override
    public String dataDoServico() {
    	
    	return ""+this.dataInstalacao.getDia()+"/"+this.dataInstalacao.getMes()+"/"
    			+this.dataInstalacao.getAno();
    }
}
