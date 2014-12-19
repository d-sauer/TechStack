package org.davorsauer.techstack.dao;

import java.io.Serializable;
import java.util.List;

import org.davorsauer.techstack.domain.Email;
import org.davorsauer.techstack.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailDaoImpl implements EmailDao {
    
    @Autowired
    private UserDao userDao;

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Email> getEmails(Long userId) {
        User user = userDao.getUser(userId);
        return user.getEmails();
    }

    @Override
    public Long addEmail(Email email) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(email);
        tx.commit();
        Serializable id = session.getIdentifier(email);
        session.close();
        return (Long) id;
    }

    @Override
    public Long removeEmail(Email email) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(email);
        tx.commit();
        Serializable id = session.getIdentifier(email);
        session.close();
        return (Long) id;
    }

    @Override
    public Long updateEmail(Email email) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(email);
        tx.commit();
        Serializable id = session.getIdentifier(email);
        session.close();
        return (Long) id;
    }
}
