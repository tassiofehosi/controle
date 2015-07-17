package vo;


public class Batalhao {

	private String nome;
	
	public Batalhao(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String toString() {
		
		return this.getNome();
	}
}
