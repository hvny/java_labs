package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object arr1[] = new Object[]{1,2,3,4,5};
        System.out.println("Исходный массив: " + Arrays.toString(arr1));

        swap(arr1, 0, 4);
        System.out.println("Поменяли местами первый и последний элементы: " + Arrays.toString(arr1));
        System.out.println("Список из элементов массива: " + arrToLIst(arr1));


        Box<Apple> appleBox1 = new Box<>();    //коробка с яблоками
        for (int i = 0; i < 3; i++){
            appleBox1.addFruit(new Apple());
        }

        Box<Orange> orangeBox1 = new Box<>();    //корообка с апельсинами
        for (int i = 0; i < 2; i++){
            orangeBox1.addFruit(new Orange());
        }
        BananaBox<Banana> bananaBox3 = new BananaBox<>(); //коробка с бананами

        BananaBox<Banana> bananaBox1 = new BananaBox<>(); //коробка с бананами
        bananaBox1.addFruit(new Banana());

        BananaBox<Banana> bananaBox2 = new BananaBox<>(); //вотрая коробка с бананами
        bananaBox2.addFruit(new Banana());
        bananaBox2.addFruit(new Banana());

        //System.out.println(bananaBox2.getWeight());

        Box<Orange> orangeBox2 = new Box<>();       //вторая коробка с апельсинами
        /*
        System.out.println("\nВес коробки appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес коробки orangeBox1: " + orangeBox1.getWeight());

        System.out.println("\nСравнили вес коробок appleBox1 и orangeBox1: ");
        appleBox1.compare(orangeBox1);

        orangeBox1.moveTo(orangeBox2);
        System.out.println("\nФрукты из orangeBox1 пересыпаны в orangeBox2");
        System.out.println("Вес коробки orangeBox1: " + orangeBox1.getWeight() + "\t\tВес коробки orangeBox2: " + orangeBox2.getWeight());
        System.out.println("\nСодержимое коробки orangeBox2: ");
        orangeBox2.printBox();*/


        System.out.println("\nСравнили вес коробок bananaBox1 и bananaBox2: ");
        bananaBox1.compare(bananaBox2);
        appleBox1.compare(orangeBox1);

        System.out.println("\nСравнили вес коробок appleBox1 и bananaBox2: ");
       // bananaBox1.compare(appleBox1);
    }

    public static void swap(Object[] arr, int index1, int index2){   //task1
        Object swap = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = swap;
    }

    public static <Object> ArrayList<Object> arrToLIst(Object[] arr){   //task2
        ArrayList<Object> new_list = new ArrayList<>(Arrays.asList(arr));
        return new_list;
    }
}