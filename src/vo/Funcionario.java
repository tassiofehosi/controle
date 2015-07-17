package vo;


public abstract class Funcionario {
	
	private String nome;
	private String graduacao;
	private static int matricula;
	
	public Funcionario(String nome, String graduacao, int matricula) {
		
		this.nome = nome;
		this.graduacao = graduacao;
		this.matricula = matricula;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getGraduacao() {
		
		return this.graduacao;
	}
	
	public void setGraduacao(String graduacao) {
		
		this.graduacao = graduacao;
	}
	
	public int getMatricula() {
		
		return this.matricula;
	}
}
