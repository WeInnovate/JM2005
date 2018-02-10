package com.atuldwivedi.jee.learn.jdbc.user;

import java.util.List;

public interface UserDao {

	public void inserUser(User user);

	public User fetchUserById(long userId);

	public void deleteUserById(String userId);

	public List<User> fetchUsers();

}
