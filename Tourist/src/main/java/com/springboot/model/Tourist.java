package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class Tourist {
	@Id
	private int Id;
	private String FName;
	private String LName;
	private String Gender;
	private int Age;
	private String FromPlace;
	private int Numberofdays;
	public int getId() {
		return Id;
	}
	
	public String getFirstName() {
		return FName;
	}

	public void setFirstName(String firstName) {
		FName = firstName;
	}

	public String getLastName() {
		return LName;
	}

	public void setLastName(String lastName) {
		LName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getFromPlace() {
		return FromPlace;
	}

	public void setFromPlace(String fromPlace) {
		FromPlace = fromPlace;
	}

	public int getNumberofdays() {
		return Numberofdays;
	}

	public void setNumberofdays(int numberofdays) {
		Numberofdays = numberofdays;
	}

	public void setId(int id) {
		Id = id;
	}

	public Tourist(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberofdays) {
		super();
		Id = id;
		FName = firstName;
		LName = lastName;
		Gender = gender;
		Age = age;
		FromPlace = fromPlace;
	    Numberofdays = numberofdays;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
