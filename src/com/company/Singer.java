package com.company;

public class Singer extends Person {
    String bandName;

    public void singing(){
        System.out.println(name+"is Singing");


    }

    public void playGitar(){
        System.out.println(name +" "+ "is playing gitar");

    }
    public String toString(){
        return "person name "+name+" designation "+designation+" bandName "+bandName;

    }
}
