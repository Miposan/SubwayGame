package action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;
import service.IUserService;

public class UserAction {
    private User loginUser;
//    private
    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }

    public User getLoginUser() {
        return loginUser;
    }
    public String login() {
        //创建 Spring 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        //获取 UserService 实例
        IUserService userService = (IUserService) ctx.getBean("userService");
        if (userService.login(loginUser)) {
            return "loginSuccess";
        }
        return "loginFail";
    }
}
