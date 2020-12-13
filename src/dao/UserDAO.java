package dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.Session;

public class UserDAO extends BaseHibernateDAO
        implements IUserDAO
{
    public List findByHql(String hql){
        // SessionFactory sf= new Configuration().configure().buildSessionFactory();
        // Session session=sf.openSession();
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            Query queryObject = session.createQuery(hql);
            return queryObject.list();
        } catch (RuntimeException re) {
            throw re;
        } finally{
            session.close();
        }
    }
}
