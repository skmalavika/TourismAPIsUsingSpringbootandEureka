package com.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.model.Tourist;
import com.springboot.repository.Touristrepository;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
class TouristApplicationTests {

@Autowired
private Touristrepository touristrepository;
   @Test
   public void testcreate() {
	   Tourist t=new Tourist();
	   t.setId(6);
	   t.setFirstName("Sneha");
	   t.setLastName("Gowda");
	   t.setGender("Female");
	   t.setAge(22);
	   t.setFromPlace("Banglore");
	   t.setNumberofdays(7);
	   touristrepository.save(t);
	   assertNotNull(touristrepository.findById(6).get());
   }
  @Test 
  public void testReadAll() {
	  List<Tourist> list=touristrepository.findAll();
	  assertThat(list).size().isGreaterThan(0);
	  
  }
}
