package org.example;
import java.util.ArrayList;

public class Box<Obj extends Fruit> {
    private ArrayList<Obj> box = new ArrayList<>();
    public Box(){}

    public void addFruit(int count, Obj type) {
        /*if (getWeight() == 0){
            box.add((Obj) new Apple());
        }*/
        for (int i = 0; i < count; i++){
            box.add(type);
        }
        System.out.println(box.getClass());
        /*
        for (int i = 0; i < count; i++){
            if (){
                box.add((Obj) new Apple());
            }
        }*/
    }


    public float getWeight() {
        float weight = 0.0f;
        for(Obj o : box){
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) {
            return true;
        }
        else{
            return false;
        }
    }

    public void moveTo(Box <Obj>anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

}

