package com.examplejpa.jpa.services;

import com.examplejpa.jpa.model.Client;

import java.util.List;

public interface ClientServiceImpl {

    List<Client> getListClient();
    Client getClientById(int id);
    void addClient(Client client);
}
