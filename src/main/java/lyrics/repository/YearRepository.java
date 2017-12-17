package lyrics.repository;

import org.springframework.data.repository.Repository;

import lyrics.model.l_year;

public interface YearRepository extends Repository<l_year, Integer>{
	
	Long findByLyric_Year(int year);

}
