package lyrics.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDAO {

	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

	protected Connection getConnection() throws SQLException {
		Connection conn;
		conn = LyricConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public BaseDAO() {

	}
	
}
