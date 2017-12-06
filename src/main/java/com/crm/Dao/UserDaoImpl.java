package com.crm.Dao;

import com.crm.Entity.User;
import org.hibernate.SessionFactory;


public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public User loginUser(User user) {
        String hql = "from User where username=? and password=?";
        User _user = (User) sessionFactory.getCurrentSession().createQuery(hql)
                .setParameter(0,user.getUsername())
                .setParameter(1,user.getPassword())
                .uniqueResult();
        return _user;
    }
}
