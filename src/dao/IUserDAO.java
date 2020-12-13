package dao;

import java.util.List;

public interface IUserDAO
{
    public List findByHql(String hql);
}
