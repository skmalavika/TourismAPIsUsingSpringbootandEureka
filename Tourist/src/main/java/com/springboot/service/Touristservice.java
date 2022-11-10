package com.springboot.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.springboot.model.Tourist;
import com.springboot.repository.Touristrepository;


@Service
public class Touristservice {
	@Autowired 
	private Touristrepository touristrepository;
	
	public Tourist saveTourist(Tourist tourist) {
	     return touristrepository.save(tourist);
	
		
	}
	@Query("select T from Tourist T order by T.FirstName DESC")
	public List<Tourist> getAllTourist(){
		List<Tourist> passengers = new ArrayList<Tourist>();
		Iterable<Tourist>pass=touristrepository.findAll();
		for(Tourist p:pass)
		{
			passengers.add(p);
		}
		return passengers;
	}
	
	public List<Tourist> AllOrderByNameDesc() {
		List <Tourist> passengers= touristrepository.findAll(Sort.by(Sort.Direction.DESC, "FName"));
		return passengers;
	}
	
	
}
