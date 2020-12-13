package service;

import dao.IUserDAO;
import po.User;

import java.util.List;

public class UserService implements IUserService{
    private IUserDAO userDAO = null;

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean login(User loginUser) {
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();
        String hql = "from User as user where username='" +username+ "' and password='" + password +"'";
        List list = userDAO.findByHql(hql);
        if(list.isEmpty())
            return false;
        else
            return true;
    }
}
