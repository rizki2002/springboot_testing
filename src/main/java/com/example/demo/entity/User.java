package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	
	@Column(name = "bank_account_id")
	private String bank_account_id;
	
	
	
	

	public User() {
		
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public User(String user_name, String password, String email, String first_name, String last_name,
			String bank_account_id) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.bank_account_id = bank_account_id;
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBank_account_id() {
		return bank_account_id;
	}

	public void setBank_account_id(String bank_account_id) {
		this.bank_account_id = bank_account_id;
	}

	

	

}
