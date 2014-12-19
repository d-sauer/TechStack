package org.davorsauer.techstack.dao;

import java.io.Serializable;
import java.util.List;

import org.davorsauer.techstack.domain.Email;
import org.davorsauer.techstack.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Long addUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        Serializable id = session.getIdentifier(user);
        session.close();
        return (Long) id;
    }

    @Override
    public int removeUser(Long userId) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        
        Query query = session.createQuery("DELETE FROM User WHERE id = :id");
        query.setParameter("id", userId);
        int updatedRows = query.executeUpdate();
        
        tx.commit();
        session.close();

        return updatedRows;
    }

    @Override
    public Long updateUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        Serializable id = session.getIdentifier(user);
        session.close();
        return (Long) id;
    }

    @Override
    public List<User> getUsers() {
        Session session = sessionFactory.openSession();

        List<User> users = session.createQuery("from User").list();
        
        session.close();
        return users;
    }

    
    public User getUser(Long userId) {
        Session session = sessionFactory.openSession();
        User user = (User) session.load(User.class, userId.longValue());
        session.close();
        
        return user;
    }

}
