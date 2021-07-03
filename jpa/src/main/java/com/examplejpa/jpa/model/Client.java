package com.examplejpa.jpa.model;

import javax.persistence.*;


@Entity
@Table(name = "Clients")
public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="client_name")
    private String name;

    public  Client(String name){
        this.name = name;
    }
    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
