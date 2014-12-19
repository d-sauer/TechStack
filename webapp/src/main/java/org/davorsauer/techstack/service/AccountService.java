package org.davorsauer.techstack.service;

import java.util.List;

import org.davorsauer.techstack.domain.Email;
import org.davorsauer.techstack.domain.User;

public interface AccountService {

    public Long addUser(User user);

    public int removeUser(Long userId);

    public Long updateUser(User user);
    
    public List<User> getUsers();

    public User getUser(Long userId);
    
    public List<Email> getEmails(Long userId);
    
    public Long addEmail(Email email);
    
    public Long removeEmail(Email email);

    public Long updateEmail(Email email);
}
