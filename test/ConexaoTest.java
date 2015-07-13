import static org.junit.Assert.*;

import org.junit.Test;

import dao.ConexaoMySQL;
import dao.IConexao;
import junit.framework.TestCase;


public class ConexaoTest extends TestCase{
	
	@Test
	public void testDeveriaRetornarConexaoValidaParaOGestor() throws Exception {
		
		IConexao conexao = new ConexaoMySQL("gestor", "gestor");
		assertNotNull(conexao.getConexao());
		
	}
	
	@Test
	public void testDeveriaRetornarConexaoValidaParaOAuxiliar() throws Exception {
		
		IConexao conexao = new ConexaoMySQL("auxiliar", "auxiliar");
		assertNotNull(conexao.getConexao());
	}


@Test
public void testDeveriaRetornarConexaoValidaParaOTecnico() throws Exception {
	
	IConexao conexao = new ConexaoMySQL("tecnico", "tecnico");
	assertNotNull(conexao.getConexao());
}

}
