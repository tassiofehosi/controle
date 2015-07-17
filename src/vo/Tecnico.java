package vo;


public class Tecnico extends Funcionario {
    
	public Tecnico(String nome, String graduacao, int matricula) {
		
		super(nome, graduacao, matricula);
    }
	
	public String retornaNome() {
		
		return getNome();
	}
	
	public void modificaNome(String nome) {
		
		setNome(nome);
	}
	
	public String retornaGraduacao() {
		
		return getGraduacao();
	}
	
	public void modificaGraduacao(String graduacao) {
		
		setGraduacao(graduacao);
	}
	
	public int retornaMatricula() {
		
		return getMatricula();
	}
}
