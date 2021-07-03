package com.examplejpa.jpa.controller;


import com.examplejpa.jpa.model.Client;
import com.examplejpa.jpa.services.ClientService;
import com.examplejpa.jpa.services.ClientServiceDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    ClientServiceDb clientServiceDb = new ClientServiceDb();
    public ClientController(){

        clientServiceDb.addClient(new Client("test"));
        clientServiceDb.addClient(new Client("test2"));
    }

    @Autowired
    ClientService clientService;

    @RequestMapping("/test")
    public String getTest(){
        return "vnjdfvdf";
    }

    @RequestMapping("/list")
    public List<Client> getAllClients(){
        return clientService.getListClient();
    }
}
