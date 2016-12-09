package cn.com.yusys.ssi.service;

import java.util.List;

import cn.com.yusys.ssi.pojo.User;

public interface UserService {

	List<User> findUserList() throws Exception;

	void insertTwoUser(User user1, User user2);
	
	void saveTwoUser(User user1, User user2);
}
