package org.example;

import java.util.ArrayList;

import java.util.Arrays;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {
        Object arr1[] = new Object[]{1,2,3,4,5};
        System.out.println("Исходный массив: " + Arrays.toString(arr1));

        swap(arr1, 0, 4);
        System.out.println("Поменяли местами первый и последний элементы: " + Arrays.toString(arr1));
        System.out.println("Список из элементов массива: " + arrToLIst(arr1));

        Apple a1 = new Apple();
        Box<Apple> appleBox1 = new Box<>();    //коробка с яблоками

        appleBox1.addFruit(3, new Apple());

        Box<Orange> orangeBox1 = new Box<>();    //корообка с апельсинами
        orangeBox1.addFruit(5, new Orange());
        Box<Orange> orangeBox2 = new Box<>();



        System.out.println("\nВес коробки appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес коробки orangeBox1: " + orangeBox1.getWeight());
        System.out.println("\nСравнили вес коробок: " + appleBox1.compare(orangeBox1));
        orangeBox1.moveTo(orangeBox2);
        System.out.println("\nФрукты из orangeBox1 пересыпаны в orangeBox2");
        System.out.println("Вес коробки orangeBox1: " + orangeBox1.getWeight() + "\t\tВес коробки orangeBox2: " + orangeBox2.getWeight());
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