package com.atuldwivedi.jee.learn.jdbc.user;

public class MyUserApp {

	public static void main(String[] args) {
		User user = new User(10001L, "Sachin", 20, "Male");
		UserDao userDao = new UserDaoImpl();
		userDao.inserUser(user);
	}
}
