package test.test;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lyrics.repository.YearRepository;

@RestController
public class lyrics {
	
	YearRepository yearRepository;
	
@GetMapping(value = "/hellow")
@Transactional
  public String test() {
	  return  "Hello";
  }



  

}
