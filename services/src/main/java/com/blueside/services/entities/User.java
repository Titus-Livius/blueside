package com.blueside.services.entities;

public class User extends Entity {

	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public User(String firstName, String lastName, String emailAddress) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmailAddress(emailAddress);
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
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String email) {
		this.emailAddress = email;
	}
}
