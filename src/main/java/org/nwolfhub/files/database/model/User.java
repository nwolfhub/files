package org.nwolfhub.files.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    public String id;
    public String username;
    public String firstname;
    public String lastname;
    public Long sizeLimit;

    public User() {}

    public User(String id, String username, String firstname, String lastname, Long sizeLimit) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.sizeLimit = sizeLimit;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Long getSizeLimit() {
        return sizeLimit;
    }

    public User setSizeLimit(Long sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }
}
