package com.company;

public class Dancer extends Person {
    String groupName;

    public void dancing(){
        System.out.println(name+ " is dancing");

    }
    @Override
    public String toString(){
        return "person name "+name+" designation "+designation+" groupName "+groupName;

    }
}
