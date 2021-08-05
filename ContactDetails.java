package com.Addressbook;

public class ContactDetails {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zip;
	long phoneNum;
	String email;
	//Parameterized Constructor
	public ContactDetails(String fName, String lName, String add, String city, String state, long zip, long phNum,
			String email) {
		this.firstName = fName;
		this.lastName = lName;
		this.address = add;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phNum;
		this.email = email;
	}
	//Non Parameterized Constructor
	public ContactDetails() {

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact Details are \n" + " FirstName :" + firstName + "\n lastName:" + lastName + "\n address:"
				+ address + "\n city:" + city + "\n state:" + state + "\n zip:" + zip + "\n phoneNum:" + phoneNum
				+ "\n eMail:" + email;
	}

}
