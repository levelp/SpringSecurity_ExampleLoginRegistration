package org.levelp.auth.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.levelp.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Anastasiya Solodkaya.
 */
public class UsersDAOImpl implements UsersDAO{

    @Autowired
    private SessionFactory factory;

    @Transactional
    @Override
    public void register(User user) {
        Session session = factory.openSession();
        session.saveOrUpdate(user);
        session.close();
    }

    @Override
    public User findByLogin(String login) {
        Session session = factory.openSession();
        User user = (User) session.createQuery("from User where login = :login")
                .setParameter("login", login)
                .uniqueResult();
        session.close();
        return user;
    }
}
