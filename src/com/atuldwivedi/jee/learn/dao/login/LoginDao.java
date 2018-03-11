package com.atuldwivedi.jee.learn.dao.login;

import com.atuldwivedi.jee.learn.jdbc.user.User;

public interface LoginDao {
	public void inserLogin(String userName, String password);

	public User fetchUserLoginDetailByUserName(String userName);

	public void deleteLoginDetailByUserName(String userName);

}
