package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ILoginDAO {
	
	ResultSet listar() throws SQLException;

}
