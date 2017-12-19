package test.test;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lyrics.dao.LyricYearDAO;
import lyrics.model.TrendingMovies;
import lyrics.model.l_year;

@RestController
public class LatestLyrics {
	
	@GetMapping(value = "/latest", produces = "application/json")
	@Transactional
	  public HashMap<String, String> test() {
		
		 HashMap<String, String> map = new HashMap<>();
//		    map.put("key", "value");
//		    map.put("foo", "bar");
//		    map.put("aa", "bb");
		 
		    return map;
	  }
	
	@GetMapping(value = "/years", produces = "application/json")
	@Transactional
	public List<l_year> findAllYears() {
		List<l_year> year = new LyricYearDAO().findAll();
		
		return year;
	}
	
	
	@GetMapping(value = "/trending", produces = "application/json")
	@Transactional
	public List<TrendingMovies> findTrending() {
		List<TrendingMovies> movies = null;
		
		return movies;
	}
	
	
	
	
	
	

   
	
	
}
