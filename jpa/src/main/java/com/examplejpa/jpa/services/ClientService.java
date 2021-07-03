package com.examplejpa.jpa.services;

import com.examplejpa.jpa.model.Client;
import com.examplejpa.jpa.model.SimpleClientList;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService implements ClientServiceImpl {
    @Override
    public void addClient(Client client) {

    }

    @Override
    public List<Client> getListClient() {

        List<Client> list = new SimpleClientList().getList();
        return list;
    }

    @Override
    public Client getClientById(int id) {
        return null;
    }
}
