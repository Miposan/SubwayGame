package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class UserDao implements IUserDao {
    public List findByHql(String hql){
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        try {
            String queryString = hql;
            Query queryObject = session.createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            throw re;
        } finally{
            session.close();
        }
    }
}
