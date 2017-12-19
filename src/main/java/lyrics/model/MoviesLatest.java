package lyrics.model;

import java.sql.Timestamp;

public class MoviesLatest {

	private int id;
	private String movieName;
	private Timestamp movieReleaseDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Timestamp getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(Timestamp movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
}
