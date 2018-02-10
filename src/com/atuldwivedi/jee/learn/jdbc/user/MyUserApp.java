package com.atuldwivedi.jee.learn.jdbc.user;

public class MyUserApp {

	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		
//		User user = new User(10002L, "Sehwag", 20, "Male");
//		userDao.inserUser(user);
		
		User u = userDao.fetchUserById(10002L);
		System.out.println(u);
	}
	
}
