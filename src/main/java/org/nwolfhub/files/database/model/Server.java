package org.nwolfhub.files.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Server {
    @Id
    public String id;
    public String name;
    public String url;
    public Integer port;
    public Long spaceLeft;

    public Server() {}
    public Server(String id, String name, String url, Integer port, Long spaceLeft) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.port = port;
        this.spaceLeft = spaceLeft;
    }

    public String getId() {
        return id;
    }

    public Server setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Server setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Server setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public Server setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Long getSpaceLeft() {
        return spaceLeft;
    }

    public Server setSpaceLeft(Long spaceLeft) {
        this.spaceLeft = spaceLeft;
        return this;
    }
}
