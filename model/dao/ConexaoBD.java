package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private final String usuario = "gestor";
	private final String senha = "gestor";
	public static Connection conexao = null;

	public Connection getConexao() {
		try {
			if (this.usuario == "" || this.senha == "" || this.usuario == null
					|| this.senha == null) {
				return null;
			}

			if (conexao == null) {
				conexao = DriverManager.getConnection(
						"jdbc:mysql://localhost/controle", this.usuario,
						this.senha);
			}

			return conexao;

		} catch (SQLException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
	}
}