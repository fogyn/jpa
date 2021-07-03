package com.examplejpa.jpa.services;

import com.examplejpa.jpa.model.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ClientServiceDb implements ClientServiceImpl {
    public ClientServiceDb() {
    }

    @Override
    public List<Client> getListClient() {
        return HaibernateService.getSessionFactory().openSession().createQuery("from Clients",Client.class ).list();
    }

    @Override
    public Client getClientById(int id) {

        return HaibernateService.getSessionFactory().openSession().get(Client.class, id);
    }

    @Override
    public void addClient(Client client) {
        Session session = HaibernateService.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();//применение sql команды к базе данных
        session.close();
    }
}
