package org.example;

import org.postgresql.Driver;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Vasya", "Pupkin", 45,"vasya@yandex.ru", "4567");
        Person p2 = new Person(2, "Marina", "Pupkina", 12, "mar@gmail.com", "5647");
        p1.getInf();
        p2.getInf();

    }
}