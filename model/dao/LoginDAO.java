package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO implements ILoginDAO {

	static Connection conexao;

	public LoginDAO(Connection conexaoBD) {
		this.conexao = conexaoBD;
	}

	public boolean consultar(String paramUsuario, String paramSenha)
			throws SQLException {
		try {
			PreparedStatement pstmt = conexao
					.prepareStatement("select * from login where usuario ='"
							+ paramUsuario + "' and senha ='" + paramSenha
							+ "'");

			ResultSet rs = pstmt.executeQuery();

			String nome = null;
			String senha = null;

			while (rs.next()) {
				nome = rs.getString("usuario");
				senha = rs.getString("senha");
			}

			if (nome != null && senha != null) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Erro = " + e.getMessage());
			return false;
		}
	}

	@Override
	public ResultSet listar() throws SQLException{
		// TODO Auto-generated method stub
		try{
			PreparedStatement pstmt = conexao.prepareStatement("select * from login");
			ResultSet rs = pstmt.executeQuery();
			return rs;
		}catch(SQLException e){
			System.out.println();
		}
		return null;
	}

}
