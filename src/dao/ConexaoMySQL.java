package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL implements IConexao {private String usuario;
private String senha;
private static Connection conexao;

public ConexaoMySQL(String usuario, String senha) {
	// TODO Auto-generated constructor stub
	
	this.usuario = usuario;
	this.senha = senha;
}

@Override
public Connection getConexao() {
	// TODO Auto-generated method stub
	
	//ERADO! DEVERIA ESTAR EM UMA CLASSE DA CAMADA DE NEGÓCIO // Será criado um BO para tratar essa regra
	if(this.usuario == "" || this.senha == "" || this.usuario == null || this.senha == null) {
		return null;
	}
	
	try {
		if(conexao == null) {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/controle", this.usuario, this.senha);
		}
		
		return conexao;
     } catch (SQLException e) {
    	 	throw new RuntimeException("Erro na conexão: "+e.getMessage());
    }
}
}


