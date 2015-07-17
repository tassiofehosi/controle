package vo;


import javax.swing.JOptionPane;

public class Servico {
    
	private ViaturaOrigem viaturaOrigem;
	private ViaturaDestino viaturaDestino;
	private Tecnico tecnico;

	public Servico(ViaturaOrigem viaturaOrigem, ViaturaDestino viaturaDestino, Tecnico tecnico) {
    	
        this.viaturaOrigem = viaturaOrigem;
        this.viaturaDestino = viaturaDestino;
		this.tecnico = tecnico;
    }
	
	public Servico() {
		
	}
    
    public void exibeRadioDesinstalado() {
    	
    	System.out.println("***** Dados da Desinstalação *****\n\n");
    	viaturaOrigem.exibeRadioDesinstalado();
    	System.out.println("Responsável Técnico: "+tecnico.retornaNome());
    	System.out.println("Graduação: "+tecnico.retornaGraduacao()+"\n\n");
    }
    
    public void exibeRadioInstalado() {
    	
    	System.out.println("***** Dados da Instalação *****\n\n");
    	viaturaDestino.exibeRadioInstalado();
    	System.out.println("Responsável Técnico: "+tecnico.retornaNome());
    	System.out.println("Graduação: "+tecnico.retornaGraduacao()+"\n\n");
    }
    
    public static void menu() {
    	
    	String opcao;    	
    	opcao = JOptionPane.showInputDialog("**** SCRT - SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR *****\n\n"
    										+"1 - Efetuar Login\n"
    										+"2 - Cadastrar Usuário\n"
    										+"3 - Editar Usuário\n"
    										+"4 - Excluir Usuário\n"
    										+"5 - Consultar Dados do Usuário\n"
    										+"6 - Cadastrar Rádio Transceptor\n"
    										+"7 - Editar dados Rádio Transceptor\n"
    										+"8 - Excluir dados Rádio Transmissor\n"
    										+"9 - Consultar dados Rádio Transceptor");
    	
    	switch(opcao) {
		
			case "6":
			
				String fabricante;
				String modelo;
				String numeroSerial;
				String cm;
			
				fabricante = JOptionPane.showInputDialog("Fabricante");
				modelo = JOptionPane.showInputDialog("Modelo");
				numeroSerial = JOptionPane.showInputDialog("Número Serial");
				cm = JOptionPane.showInputDialog("CM");
			
				RadioTransceptor radio1 = new RadioTransceptor(fabricante, modelo, numeroSerial, cm);
				RadioTransceptor radio2 = new RadioTransceptor(fabricante, modelo, numeroSerial, cm);
			
				String dia;
				String mes;
				String ano;
			
				JOptionPane.showMessageDialog(null, "Informe a data de Desinstalação do Rádio", "***** SCRT – SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****",JOptionPane.INFORMATION_MESSAGE, null);
			
				dia = JOptionPane.showInputDialog("Informe data da Desinstalação\n\n"+"Dia");   			
				mes = JOptionPane.showInputDialog("Informe data da Desinstalação\n\n"+"Mês");
				ano = JOptionPane.showInputDialog("Informe data da Desinstalação\n\n"+"Ano");
			
				Data dataDesinstalacao = new Data(dia,mes,ano);
			
				JOptionPane.showMessageDialog(null, "Informe a data de Instalação do Rádio", "***** SCRT – SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****",JOptionPane.INFORMATION_MESSAGE, null);
			
				dia = JOptionPane.showInputDialog("Informe data da Instalação\n\n"+"Dia");   			
				mes = JOptionPane.showInputDialog("Informe data da Instalação\n\n"+"Mês");
				ano = JOptionPane.showInputDialog("Informe data da Instalação\n\n"+"Ano");
			
				Data dataInstalacao = new Data(dia,mes,ano);
			
				String vtrOrigem;
				String vtrDestino;
				String bpmOrigem;
				String bpmDestino;
			
				vtrOrigem = JOptionPane.showInputDialog("Informe a viatura de origem\n\n"+"Prefixo");
				bpmOrigem = JOptionPane.showInputDialog("Informe o BPM a que pertence a viatura\n\n");
				vtrDestino = JOptionPane.showInputDialog("Informe a viatura de destino\n\n"+"Prefixo");
				bpmDestino = JOptionPane.showInputDialog("Informe o BPM a que pertence a viatura\n\n");
			    			
				Batalhao bpm = new Batalhao("3º Batalhão");
				
				ViaturaOrigem viaturaOrigem = new ViaturaOrigem(vtrOrigem, radio1, dataDesinstalacao, bpm);
				ViaturaDestino viaturaDestino = new ViaturaDestino(vtrDestino, radio1, dataInstalacao, bpm);
			
			
			
				
			
				JOptionPane.showMessageDialog(null,"*** Dados da Desinstalação ***\n\n"+radio1+""+viaturaOrigem, "***** SCRT – SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****", JOptionPane.INFORMATION_MESSAGE, null);
				JOptionPane.showMessageDialog(null,"*** Dados da Instalação ***\n\n"+radio1+""+viaturaDestino, "***** SCRT – SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****", JOptionPane.INFORMATION_MESSAGE, null);
    		}
    	}
}
