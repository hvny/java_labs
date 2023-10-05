package org.example;

public class Cat implements contestant {

    private String name;
    private int max_distance;
    private int max_height;
    public Cat(String name, int max_distance, int max_height){
        this.name = name;
        this.max_distance = max_distance;
        this.max_height = max_height;
    }

    public boolean run(int distance) {
        if (distance <= max_distance){
            System.out.printf("\nКот " + name + " пробежал " + distance + "\n");
            return true;
        }
        else {
            System.out.printf("\nКот " + name + " не смог пробежать " + distance + "\n");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= max_height){
            System.out.printf("\nКот " + name + " прыгнул на " + height + "\n");
            return true;
        }
        else {
            System.out.printf("\nКот " + name + " не смог прыгнуть на " + height + "\n");
            return false;
        }
    }
}
