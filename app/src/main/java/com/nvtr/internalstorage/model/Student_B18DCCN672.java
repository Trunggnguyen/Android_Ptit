package com.nvtr.internalstorage.model;

import java.io.Serializable;

public class Student_B18DCCN672 implements Serializable {
    int id ;
    String name;
    String address;
    String birth;

    public Student_B18DCCN672(int id, String name, String address, String birth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birth = birth;
    }

    public Student_B18DCCN672() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
