package com.company;

public class Programmer extends Person{
    String companyName;

    public void coding(){
        System.out.println(name+" "+ "is coging");

    }
    public String toString(){
        return "person name "+name+" designation "+designation+" companyName "+companyName;

    }

}
