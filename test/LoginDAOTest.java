import static org.junit.Assert.*;

import java.sql.Connection;
 



import org.junit.Test;
 



import dao.ConexaoMySQL;
import dao.IConexao;
import dao.LoginDAO;
import junit.framework.TestCase;



public class LoginDAOTest extends TestCase{
	
	@Test
	public void testDeveriaRetornarTrueSeLoginSenhaValidos() throws Exception {
		Connection conexaoBD;
		
		IConexao conexao = new ConexaoMySQL("gestor", "gestor");
		conexaoBD = conexao.getConexao();
 
		LoginDAO login = new LoginDAO(conexaoBD);
		

		assertTrue(login.consultar("tassio","123456"));

	}
	
	

	



}
