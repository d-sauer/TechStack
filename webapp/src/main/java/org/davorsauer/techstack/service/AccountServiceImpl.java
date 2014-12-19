package org.davorsauer.techstack.service;

import java.util.List;

import org.davorsauer.techstack.dao.EmailDao;
import org.davorsauer.techstack.dao.UserDao;
import org.davorsauer.techstack.domain.Email;
import org.davorsauer.techstack.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private EmailDao emailDao;

    @Override
    public Long addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int removeUser(Long userId) {
        return userDao.removeUser(userId);
    }

    @Override
    public Long updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public User getUser(Long userId) {
        return userDao.getUser(userId);
    }

    @Override
    public List<Email> getEmails(Long userId) {
        return emailDao.getEmails(userId);
    }

    @Override
    public Long addEmail(Email email) {
        return emailDao.addEmail(email);
    }

    @Override
    public Long removeEmail(Email email) {
        return emailDao.removeEmail(email);
    }

    @Override
    public Long updateEmail(Email email) {
        return emailDao.updateEmail(email);
    }
    
   

}
