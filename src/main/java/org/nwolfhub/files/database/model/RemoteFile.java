package org.nwolfhub.files.database.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "files")
public class RemoteFile {
    @Id
    public String id;
    @ManyToOne
    @JoinColumn(name = "id")
    public User owner;
    public String filename;
    @ManyToMany
    public List<Server> servers;
    //TODO: think how to implement encoding. I am really not fine with keeping everything in its pure view. I am fine if I can't decode it (I don't need it), but the content should be secure


    public RemoteFile(String id, User owner, String filename, List<Server> servers) {
        this.id = id;
        this.owner = owner;
        this.filename = filename;
        this.servers = servers;
    }

    public RemoteFile() {}

    public String getId() {
        return id;
    }

    public RemoteFile setId(String id) {
        this.id = id;
        return this;
    }

    public User getOwner() {
        return owner;
    }

    public RemoteFile setOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public RemoteFile setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public List<Server> getServers() {
        return servers;
    }

    public RemoteFile setServers(List<Server> servers) {
        this.servers = servers;
        return this;
    }
}
