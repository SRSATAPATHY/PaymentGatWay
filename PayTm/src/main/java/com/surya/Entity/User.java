package com.surya.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "PayTm_User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_Id")
	private int user_Id;
	
	@NotNull(message="FirstName cannot be null")
	@Size(min=5, max=30)
	@Column(name = "First_Name")
	private String firstName;

	@NotNull(message="LastName cannot be null")
	@Size(min=5, max=30)
	@Column(name = "Last_Name")
	private String lastName;

	@Email
	@Column(name = "Email")
	private String email;

	@Column(name = "Mobile_Number")
	private int mobileNo;

	@NotNull(message="Password cannot be null")
	@Size(min=5, max=30)
	@Column(name = "Password")
	private String password;

	public int getUser_Id() {
		return user_Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
