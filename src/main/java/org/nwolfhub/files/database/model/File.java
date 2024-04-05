package org.nwolfhub.files.database.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class File {
    @Id
    public String id;
    @ManyToOne
    @JoinColumn(name = "id")
    public User owner;
    public String filename;
    @ManyToMany
    public List<Server> servers;
    //TODO: think how to implement encoding. I am really not fine with keeping everything in its pure view. I am fine if I can't decode it (I don't need it), but the content should be secure
}
