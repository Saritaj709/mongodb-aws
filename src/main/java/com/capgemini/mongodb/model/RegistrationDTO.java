package com.capgemini.mongodb.model;

public class RegistrationDTO {

	private String email;
	private String firstname;
	private String lastname;
	private String phoneNo;
	private String password;
	private String confirmPassword;

	public RegistrationDTO() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "RegistrationDTO [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", phoneNo="
				+ phoneNo + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
}
