package org.example;
import java.util.ArrayList;
import java.util.Objects;

public class Box<Obj extends Fruit> {
    private ArrayList<Obj> box = new ArrayList<>();
    public Box(){}
    public void addFruit(Obj fruit) {
        box.add(fruit);
    }

    private String getTypeOfFruit() {
        String className = "";
        for (Obj o : box) {
            className = o.getClass().getName();
            break;
        }
        return className;
    }
    public float getWeight() {      //получаем вес коробки
        float weight = 0.0f;
        for(Obj o : box){
            weight += o.getWeight();
        }
        return weight;
    }

    public void compare(Box anotherBox) {        //сравниваем две коробки
        if(getWeight() == anotherBox.getWeight()) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public void moveTo(Box <Obj>anotherBox) {       //пересыпаем фрукты в другую коробку
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void printBox() {            //печатаем содержимое коробки
        for(Obj o : box){
             System.out.println(o);
        }
    }
}