package com.atuldwivedi.jee.learn.jdbc.user;

public class User {

	private long userId;

	private String userName;

	private int age;

	private String gender;

	public User(long userId, String userName, int age, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
