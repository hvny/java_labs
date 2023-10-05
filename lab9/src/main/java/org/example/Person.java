package org.example;

import java.io.Console;
@Table
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String mail;
    private String number;

    public Person(int ID, String Name, String Surname, int Age, String Mail, String Number ){
        this.id = ID;
        this.name = Name;
        this.surname = Surname;
        this.age = Age;
        this.mail = Mail;
        this.number = Number;
    }

    public void getInf(){
        System.out.println(this.id + ". " + this.name + " " + this.surname + " " + this.age);
    }
}
