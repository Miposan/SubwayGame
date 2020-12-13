package service;

import dao.IUserDao;
import dao.UserDao;
import po.User;

import java.util.List;

public class UserService implements IUserService{
    private IUserDao userDao = null;

    public IUserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
    public boolean login(User loginUser) {
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();
        String hql = "from user as user where username='" +username+ "' and password='" + password +"'";
        List list = userDao.findByHql(hql);
        if(list.isEmpty())
            return false;
        else
            return true;
    }
}
