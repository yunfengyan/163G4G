package com.qhit.lh.g02.shutu.t5.dao;

import java.util.List;

import com.qhit.lh.g02.shutu.t5.been.User;

public interface UserDao {
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int uid);
	public List<User> queryAllUser();
	public User querySingleUser(int uid);
}
