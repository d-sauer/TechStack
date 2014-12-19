package org.davorsauer.techstack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="emails")
public class Email {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="user_id")
    private Long userId;
    
    @Column(nullable=false)
    private String email;

    //
    //
    //
    
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
