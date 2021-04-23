package com.example.Phonebook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phonebook {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long  phonenumber;
	private String email;
	public Phonebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phonebook(Long id, String name, Long phonenumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
