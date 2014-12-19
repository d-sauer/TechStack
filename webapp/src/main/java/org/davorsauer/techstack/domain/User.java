package org.davorsauer.techstack.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity(name="users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name="user_name")
    private String userName;

    @Column(name="first_name", nullable=true)
    private String firstName;
    
    @Column(name="last_name", nullable=true)
    private String lastName;
    
    @Column(name="when_created")
    private Date whenCreated;
    
    @Column(name="last_access", nullable=true)
    private Date lastAccess;

    @OneToMany(fetch=FetchType.LAZY, orphanRemoval = true, cascade=CascadeType.ALL, targetEntity=Email.class)
    @JoinColumn(name="user_id")
    List<Email> emails;
    //
    //
    //
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(Date whenCreated) {
        this.whenCreated = whenCreated;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public List<Email> getEmails() {
        return emails;
    }
    
    
    
}
