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
    	
    	System.out.println("***** Dados da Desinstala��o *****\n\n");
    	viaturaOrigem.exibeRadioDesinstalado();
    	System.out.println("Respons�vel T�cnico: "+tecnico.retornaNome());
    	System.out.println("Gradua��o: "+tecnico.retornaGraduacao()+"\n\n");
    }
    
    public void exibeRadioInstalado() {
    	
    	System.out.println("***** Dados da Instala��o *****\n\n");
    	viaturaDestino.exibeRadioInstalado();
    	System.out.println("Respons�vel T�cnico: "+tecnico.retornaNome());
    	System.out.println("Gradua��o: "+tecnico.retornaGraduacao()+"\n\n");
    }
    
    public static void menu() {
    	
    	String opcao;    	
    	opcao = JOptionPane.showInputDialog("**** SCRT - SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR *****\n\n"
    										+"1 - Efetuar Login\n"
    										+"2 - Cadastrar Usu�rio\n"
    										+"3 - Editar Usu�rio\n"
    										+"4 - Excluir Usu�rio\n"
    										+"5 - Consultar Dados do Usu�rio\n"
    										+"6 - Cadastrar R�dio Transceptor\n"
    										+"7 - Editar dados R�dio Transceptor\n"
    										+"8 - Excluir dados R�dio Transmissor\n"
    										+"9 - Consultar dados R�dio Transceptor");
    	
    	switch(opcao) {
		
			case "6":
			
				String fabricante;
				String modelo;
				String numeroSerial;
				String cm;
			
				fabricante = JOptionPane.showInputDialog("Fabricante");
				modelo = JOptionPane.showInputDialog("Modelo");
				numeroSerial = JOptionPane.showInputDialog("N�mero Serial");
				cm = JOptionPane.showInputDialog("CM");
			
				RadioTransceptor radio1 = new RadioTransceptor(fabricante, modelo, numeroSerial, cm);
				RadioTransceptor radio2 = new RadioTransceptor(fabricante, modelo, numeroSerial, cm);
			
				String dia;
				String mes;
				String ano;
			
				JOptionPane.showMessageDialog(null, "Informe a data de Desinstala��o do R�dio", "***** SCRT � SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****",JOptionPane.INFORMATION_MESSAGE, null);
			
				dia = JOptionPane.showInputDialog("Informe data da Desinstala��o\n\n"+"Dia");   			
				mes = JOptionPane.showInputDialog("Informe data da Desinstala��o\n\n"+"M�s");
				ano = JOptionPane.showInputDialog("Informe data da Desinstala��o\n\n"+"Ano");
			
				Data dataDesinstalacao = new Data(dia,mes,ano);
			
				JOptionPane.showMessageDialog(null, "Informe a data de Instala��o do R�dio", "***** SCRT � SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****",JOptionPane.INFORMATION_MESSAGE, null);
			
				dia = JOptionPane.showInputDialog("Informe data da Instala��o\n\n"+"Dia");   			
				mes = JOptionPane.showInputDialog("Informe data da Instala��o\n\n"+"M�s");
				ano = JOptionPane.showInputDialog("Informe data da Instala��o\n\n"+"Ano");
			
				Data dataInstalacao = new Data(dia,mes,ano);
			
				String vtrOrigem;
				String vtrDestino;
				String bpmOrigem;
				String bpmDestino;
			
				vtrOrigem = JOptionPane.showInputDialog("Informe a viatura de origem\n\n"+"Prefixo");
				bpmOrigem = JOptionPane.showInputDialog("Informe o BPM a que pertence a viatura\n\n");
				vtrDestino = JOptionPane.showInputDialog("Informe a viatura de destino\n\n"+"Prefixo");
				bpmDestino = JOptionPane.showInputDialog("Informe o BPM a que pertence a viatura\n\n");
			    			
				Batalhao bpm = new Batalhao("3� Batalh�o");
				
				ViaturaOrigem viaturaOrigem = new ViaturaOrigem(vtrOrigem, radio1, dataDesinstalacao, bpm);
				ViaturaDestino viaturaDestino = new ViaturaDestino(vtrDestino, radio1, dataInstalacao, bpm);
			
			
			
				
			
				JOptionPane.showMessageDialog(null,"*** Dados da Desinstala��o ***\n\n"+radio1+""+viaturaOrigem, "***** SCRT � SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****", JOptionPane.INFORMATION_MESSAGE, null);
				JOptionPane.showMessageDialog(null,"*** Dados da Instala��o ***\n\n"+radio1+""+viaturaDestino, "***** SCRT � SISTEMA DE CONTROLE DE RADIO TRANSCEPTOR ****", JOptionPane.INFORMATION_MESSAGE, null);
    		}
    	}
}
