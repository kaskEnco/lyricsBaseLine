package lyrics.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lyrics.model.l_year;

public class LyricYearDAO extends BaseDAO{public List<l_year> findAll() {
	List<l_year> years = new ArrayList<l_year>();
	l_year year =null;
	String queryString = "SELECT * FROM l_year ";
	try {
		connection = getConnection();
		ptmt = connection.prepareStatement(queryString);
		resultSet = ptmt.executeQuery();
		while(resultSet.next()) {
			year = new l_year();
			year.setId(resultSet.getInt("id"));
			year.setLyircYear(resultSet.getInt("lyric_year"));
			years.add(year);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return  years;
}


public l_year findById(int Id) {
	l_year year = new l_year();
	String queryString = "SELECT * FROM l_year where id = ?  ";
	try {
		connection = getConnection();
		ptmt = connection.prepareStatement(queryString);
		ptmt.setInt(1, Id);
		resultSet = ptmt.executeQuery();
		while(resultSet.next()) {
			year.setId(resultSet.getInt("id"));
			year.setLyircYear(resultSet.getInt("lyric_year"));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return  year;
}}
