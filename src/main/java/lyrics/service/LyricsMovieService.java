package lyrics.service;

import org.springframework.stereotype.Service;

import lyrics.interfaces.KaskCommon;

@Service
public class LyricsMovieService implements KaskCommon{

	@Override
	public String getMoviesLatest() {
		// TODO Auto-generated method stub
		return "latest";
	}

}
