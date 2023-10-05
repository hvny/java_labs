package org.example;

public class Human implements contestant {
    private String name;
    private int max_distance;
    private int max_height;
    public Human(String name, int max_distance, int max_height){
        this.name = name;
        this.max_distance = max_distance;
        this.max_height = max_height;
    }

    public boolean run(int distance) {
        if (distance <= max_distance){
            System.out.printf("\nЧеловек " + name + " пробежал " + distance + "\n");
            return true;
        }
        else {
            System.out.printf("\nЧеловек " + name + " не смог пробежать " + distance + "\n");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= max_height){
            System.out.printf("\nЧеловек " + name + " прыгнул на " + height + "\n");
            return true;
        }
        else {
            System.out.printf("\nЧеловек " + name + " не смог прыгнуть на " + height + "\n");
            return false;
        }
    }
}
