package com.devcamp.pizza365.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class CUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "user_name", unique = true)
	private String username;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "customer_type")
	private String customerType;
	
	@Column(name = "register_status")
	private String registerStatus;

	public CUser() {
	}

	public CUser(String firstname, String lastname, String country, String subject, String customerType,
			String registerStatus) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.subject = subject;
		this.customerType = customerType;
		this.registerStatus = registerStatus;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the registerStatus
	 */
	public String getRegisterStatus() {
		return registerStatus;
	}

	/**
	 * @param registerStatus the registerStatus to set
	 */
	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	
}
