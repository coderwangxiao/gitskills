package cn.com.yusys.ssi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.yusys.ssi.dao.UserDao;
import cn.com.yusys.ssi.pojo.User;
import cn.com.yusys.ssi.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> findUserList() throws Exception {
		List<User> list = userDao.findUserList();
		return list;
	}

	public void insertTwoUser(User user1, User user2) {
		try {
			userDao.insertUser(user1);
			//int i = 1/0;
			userDao.insertUser(user2);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	public void saveTwoUser(User user1, User user2) {
		try {
			userDao.insertUser(user1);
			int i = 1/0;
			userDao.insertUser(user2);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
