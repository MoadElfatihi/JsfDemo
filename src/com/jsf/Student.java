package com.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String country;
	
	private List listOfCountry;
	
	private String gender;
	
	private String[] languageSpoken;
	
	public Student() { 
		this.listOfCountry = new ArrayList<String>();
	    listOfCountry.add("Brazil");
	    listOfCountry.add("France");
	    listOfCountry.add("Germany");
	    listOfCountry.add("India");
	    listOfCountry.add("Turkey");
	    listOfCountry.add("United Kingdom");
	    listOfCountry.add("United States");
	}

	
	public List getListOfCountry() {
		return listOfCountry;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String[] getLanguageSpoken() {
		return languageSpoken;
	}


	public void setLanguageSpoken(String[] languageSpoken) {
		this.languageSpoken = languageSpoken;
	}
	
}
