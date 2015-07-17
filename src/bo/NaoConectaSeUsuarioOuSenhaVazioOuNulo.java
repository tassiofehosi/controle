package bo;

import java.sql.Connection;

import dao.ConexaoMySQL;
import dao.IConexao;

public class NaoConectaSeUsuarioOuSenhaVazioOuNulo implements IConexao{
	private String usuario;
	private String senha;
	private static Connection conexao;
	
	


	public NaoConectaSeUsuarioOuSenhaVazioOuNulo(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}


	@Override
	public Connection getConexao() {
		// TODO Auto-generated method stub
		
		if (this.usuario  == "" || this.senha == "" || this.usuario == null
				|| this.senha == null) {
			return null;
		}
		return null;
	}


}
