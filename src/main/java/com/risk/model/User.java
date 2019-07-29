package com.risk.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.risk.validator.IsValidEmail;
import com.risk.validator.IsphoneNumber;
import com.risk.validator.Validpassword;

public class User {

	@NotEmpty
	@Pattern(regexp = "^[A-Za-z][^0-9,@#$%&(!)]+")
	@Size(min = 5, max = 50)
	private String name;

	@Min(value = 18)
	@Max(value = 100)
	@NotNull
	private int age;

	@IsValidEmail
	private String email;

	@IsphoneNumber
	private String phone;

	@NotEmpty
	/* @Validpassword */
	private String password;

	
	/*
	 * @NotEmpty
	 * 
	 * private String confirm_password;
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	/*
	 * public String getConfirm_password() { return confirm_password; }
	 * 
	 * public void setConfirm_password(String confirm_password) {
	 * this.confirm_password = confirm_password; }
	 */
	 

	public User(String name, int age, String email, String phone, String password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public User() {
		super();
	}

}
