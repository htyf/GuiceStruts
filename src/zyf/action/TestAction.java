package zyf.action;

import zyf.entity.User;
import zyf.service.TestService;

import com.google.inject.Inject;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestAction extends ActionSupport implements ModelDriven<User>{
	@Inject
	User user;
	@Inject  
    private TestService testService;  
	
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {
		System.out.println(user);
        testService.doSomeThing();  
        return Action.SUCCESS;  
    }

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}  
}
