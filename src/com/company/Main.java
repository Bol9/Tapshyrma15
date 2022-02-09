package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dancer dancer = new Dancer();


        dancer.groupName="Dancr-Akkuu";
        dancer.name = "Akjol";
        dancer.dancing();
        dancer.designation="Aldynky mestodo";

        System.out.println(dancer);


        Programmer prog = new Programmer();

        prog.name ="Kalys";
        prog.designation = "backend";
        prog.companyName = "Peachksoft";
        prog.coding();
        prog.eat();
        prog.lern();
        prog.walk();


        Singer singer = new Singer();

        singer.name ="Mirbek";
        singer.bandName = "Ak jol group";
        singer.designation = "glavny mesto";
        singer.singing();
        singer.eat();
        singer.playGitar();
        



    }
}
