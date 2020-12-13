package dao;

import java.util.List;

public interface IUserDao {
    public List findByHql(String hql);
}
