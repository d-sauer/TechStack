package org.davorsauer.techstack.dao;

import java.util.List;

import org.davorsauer.techstack.domain.Email;
import org.davorsauer.techstack.domain.User;

public interface UserDao {

    public Long addUser(User user);

    public int removeUser(Long userId);

    public Long updateUser(User user);
    
    public List<User> getUsers();

    public User getUser(Long userId);
    
    
}
