/*
* 该类作为基本的DAO类为service层提供sessionFactory
* */
package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class BaseHibernateDAO
{
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.openSession();
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
