package lyrics.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lyrics.model.L_lyrics;

public class LyricContentDAO extends BaseDAO {

	public List<L_lyrics> findAll() {
		List<L_lyrics> lyrics = new ArrayList<L_lyrics>();
		LyricMovieDAO movieDAO = new LyricMovieDAO();
		L_lyrics lyric = null;
		String queryString = "SELECT * FROM l_lyrics ";
		try {
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				lyric = new L_lyrics();
				lyric.setId(resultSet.getInt("id"));
				lyric.setLyricTitle(resultSet.getString("lyric_title"));
				lyric.setLyricContent(resultSet.getString("lyric_content"));
				lyric.setMovie(movieDAO.findById(resultSet.getInt("movie_id")));
				lyric.setWriterName(resultSet.getString("write_name"));
				lyric.setLyricViews(resultSet.getInt("lyric_views"));
				lyric.setCreationDate(resultSet.getTimestamp("creation_date"));
				lyric.setUpdationDate(resultSet.getTimestamp("updation_date"));
				lyrics.add(lyric);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lyrics;
	}

	public L_lyrics findById(int Id) {
		L_lyrics lyric = new L_lyrics();
		LyricMovieDAO movieDAO = new LyricMovieDAO();
		String queryString = "SELECT * FROM l_lyrics where id = ?  ";
		try {
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, Id);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				lyric.setId(resultSet.getInt("id"));
				lyric.setLyricTitle(resultSet.getString("lyric_title"));
				lyric.setLyricContent(resultSet.getString("lyric_content"));
				lyric.setMovie(movieDAO.findById(resultSet.getInt("movie_id")));
				lyric.setWriterName(resultSet.getString("write_name"));
				lyric.setLyricViews(resultSet.getInt("lyric_views"));
				lyric.setCreationDate(resultSet.getTimestamp("creation_date"));
				lyric.setUpdationDate(resultSet.getTimestamp("updation_date"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lyric;
	}
}
