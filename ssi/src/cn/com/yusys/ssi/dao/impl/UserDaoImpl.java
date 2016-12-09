package cn.com.yusys.ssi.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import cn.com.yusys.ssi.dao.UserDao;
import cn.com.yusys.ssi.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SqlMapClient sqlMapClient;
	
	public List<User> findUserList() throws Exception {
		return sqlMapClient.queryForList("findUserList");
	}

	public void insertUser(User user) throws Exception {
		sqlMapClient.insert("insertUserReturnId", user);
	}
}
