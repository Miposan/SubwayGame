package action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;
import service.IUserService;

public class UserAction {
    private User loginUser;
    private IUserService userService=null;
    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public void setUserService(IUserService userService)
    {
        this.userService = userService;
    }

    public String login() {
        if (userService.login(loginUser)) {
            return "loginSuccess";
        }
        return "loginFail";
    }
}
