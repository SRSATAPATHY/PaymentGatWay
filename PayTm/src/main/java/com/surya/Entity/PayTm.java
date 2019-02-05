package com.surya.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pay_Tm")
public class PayTm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pay_Id;

	@Column(name = "User_name")
	private String username;

	@Column(name = "Password")
	private String password;

	@Column(name = "Tx_Details")
	private String transaction_Details;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTransaction_Details() {
		return transaction_Details;
	}

	public void setTransaction_Details(String transaction_Details) {
		this.transaction_Details = transaction_Details;
	}

	public int getPay_Id() {
		return pay_Id;
	}

	@Override
	public String toString() {
		return "PayTm [username=" + username + ", password=" + password + ", transaction_Details=" + transaction_Details
				+ "]";
	}

}
