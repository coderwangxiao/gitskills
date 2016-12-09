package cn.com.yusys.ssi.dao;

import java.util.List;

import cn.com.yusys.ssi.pojo.User;

public interface UserDao {
	List<User> findUserList() throws Exception;

	void insertUser(User user) throws Exception;
}
