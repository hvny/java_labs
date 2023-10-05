package org.example;

import java.util.ArrayList;

public class BananaBox<Banana extends Fruit> {

    private ArrayList<Banana> box = new ArrayList<>();

    public void addFruit(Banana fruit) {
        box.add(fruit);
    }

    public float getWeight() {      //получаем вес коробки
        float weight = 0.0f;
        for(Banana o : box) weight = weight + 2.0f;
        return weight;
    }
    public void compare(BananaBox anotherBox) {        //сравниваем две коробки
        if(getWeight() == anotherBox.getWeight()) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
