package com.ca.pojo;

public class AddUserByAdmin 
{
	private String fullName;
	private String userAddress;
	private String userContact;
	private String userEmail;
	private String userBirthDate;
	private String userName;
	private String userRole;
	private String passWord;
	
	public AddUserByAdmin() {
		// TODO Auto-generated constructor stub
	}
	
	public AddUserByAdmin(String fullName, String userName, String passWord,
			String userAddress, String userContact, String userEmail, String userRole,
			String userBirthDate) {
		
		// TODO Auto-generated constructor stub
		this.fullName=fullName;
		this.userName=userName;
		this.passWord=passWord;
		this.userAddress=userAddress;
		this.userContact=userContact;
		this.userEmail=userEmail;
		this.userRole=userRole;
		this.userBirthDate=userBirthDate;
	}

	public AddUserByAdmin(String fullName, String passWord, String userAddress,
			String userContact, String userEmail, String userBirthDate, String userRole) {
		// TODO Auto-generated constructor stub
		this.fullName=fullName;
		this.passWord=passWord;
		this.userAddress=userAddress;
		this.userContact=userContact;
		this.userEmail=userEmail;
		this.userBirthDate=userBirthDate;
		this.userRole=userRole;
	}

	public AddUserByAdmin(String userRole) {
		// TODO Auto-generated constructor stub
	this.userRole=userRole;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(String userBirthDate) {
		this.userBirthDate = userBirthDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
}
