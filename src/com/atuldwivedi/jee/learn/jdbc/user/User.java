package com.atuldwivedi.jee.learn.jdbc.user;

public class User {

	private String firstName;

	private String lastName;

	private String userName;

	private String mobile;

	private int age;

	private String gender;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public User() {
		super();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public User(String firstName, String lastName, String userName, String mobile, int age, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.mobile = mobile;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", mobile="
				+ mobile + ", age=" + age + ", gender=" + gender + "]";
	}
}
