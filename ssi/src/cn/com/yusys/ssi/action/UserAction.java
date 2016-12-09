package cn.com.yusys.ssi.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.catalina.loader.ResourceEntry;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.com.yusys.ssi.pojo.User;
import cn.com.yusys.ssi.service.UserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 4387931399931319618L;
	
	@Autowired
	private UserService userService;

	public String userList() throws Exception {
		List<User> userList = userService.findUserList();
		ActionContext.getContext().put("userList", userList);
		return "userList";
	}
	
	public void insertUsers() throws Exception {
		User user1 = new User(10, "likui", "likui", "李逵", new Date(), 1);
		User user2 = new User(11, "diaochan", "diaochan", "貂蝉", new Date(), 0);
		user1.setId(null);
		user2.setId(null);
		//userService.insertTwoUser(user1, user2);
		userService.saveTwoUser(user1, user2);
		ServletActionContext.getResponse().getWriter().print("success");
	}
	
	private HashMap<String, ResourceEntry> resourceEntries = new HashMap<String, ResourceEntry>();
	
	public HashMap<String, ResourceEntry> getResourceEntries() {
		return resourceEntries;
	}

	public void setResourceEntries(HashMap<String, ResourceEntry> resourceEntries) {
		this.resourceEntries = resourceEntries;
	}
}
