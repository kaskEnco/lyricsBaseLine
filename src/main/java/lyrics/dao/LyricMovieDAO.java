package lyrics.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lyrics.model.L_movie;
import lyrics.model.MoviesLatest;

public class LyricMovieDAO extends BaseDAO{

	
	public L_movie findALl() {
		L_movie movie = new L_movie();
		LyricLanguageDAO langDAO = new LyricLanguageDAO();
		LyricYearDAO yearDAO = new LyricYearDAO();
		String queryString = "SELECT * FROM l_movie ";
		try {
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while(resultSet.next()) {
				movie.setId(resultSet.getInt("id"));
				movie.setLanguage(langDAO.findById(resultSet.getInt("lang_id")));
				movie.setYear(yearDAO.findById(resultSet.getInt("movie_year_id")));
				movie.setMovieName(resultSet.getString("movie_name"));
				movie.setMovieReleaseDate(resultSet.getTimestamp("movie_release_date"));
				movie.setCreationDate(resultSet.getTimestamp("creation_date"));
				movie.setUpdationDate(resultSet.getTimestamp("updation_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  movie;
	}
	
	public L_movie findById(int id) {
		L_movie movie = new L_movie();
		LyricLanguageDAO langDAO = new LyricLanguageDAO();
		LyricYearDAO yearDAO = new LyricYearDAO();
		String queryString = "SELECT * FROM l_movie WHERE (id = ? )";
		try {
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, id);
			resultSet = ptmt.executeQuery();
			while(resultSet.next()) {
				movie.setId(resultSet.getInt("id"));
				movie.setLanguage(langDAO.findById(resultSet.getInt("lang_id")));
				movie.setYear(yearDAO.findById(resultSet.getInt("movie_year_id")));
				movie.setMovieName(resultSet.getString("movie_name"));
				movie.setMovieReleaseDate(resultSet.getTimestamp("movie_release_date"));
				movie.setCreationDate(resultSet.getTimestamp("creation_date"));
				movie.setUpdationDate(resultSet.getTimestamp("updation_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  movie;
	}
	
	public List<MoviesLatest> findLatest(){
		MoviesLatest latest = new MoviesLatest();
		List<MoviesLatest> moviesLatest = new ArrayList<MoviesLatest>();
		
		String queryString = "SELECT * FROM lyrics.l_movie ORDER BY movie_release_date DESC";
		
		return null;
	}
}
