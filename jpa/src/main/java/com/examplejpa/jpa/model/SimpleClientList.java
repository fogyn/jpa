package com.examplejpa.jpa.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleClientList {

    private List<Client> list = new ArrayList<>();

    public SimpleClientList() {

        list.add(new Client(1, "test1"));
        list.add(new Client(2, "test2"));
        list.add(new Client(3, "test3"));
        list.add(new Client(4, "test4"));
        list.add(new Client(5, "test5"));
    }

    public List<Client> getList() {
        return list;
    }

    public void setList(List<Client> list) {
        this.list = list;
    }
}
