package org.davorsauer.techstack.dao;

import java.util.List;

import org.davorsauer.techstack.domain.Email;

public interface EmailDao {
    public List<Email> getEmails(Long userId);

    public Long addEmail(Email email);

    public Long removeEmail(Email email);

    public Long updateEmail(Email email);
}
