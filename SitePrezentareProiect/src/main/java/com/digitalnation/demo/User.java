package com.digitalnation.demo;

public class User {
	  public String nume;
	  public String prenume;
	  public enum Functie{ 
		  STUDENT,
		  PROFESOR,
		  ALTAFUNCTIE;
	  }
	public User(String nume, String prenume) {
		super();
		this.nume = nume;
		this.prenume = prenume;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	  
	 public User() {
		 
	 }
	}