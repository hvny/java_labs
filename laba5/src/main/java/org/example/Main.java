package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"python",
            "dog",
            "python",
            "cat",
            "tiger",
            "unicorn",
            "pantera",
            "hedgehog",
            "unicorn",
            "cat",
            "beaver",
            "rabbit",
            "unicorn",
            "hare"};

        Map<String, Integer> counter = new HashMap<>(); //словарь (слово: кол-во)
        List<String> duplicates= new ArrayList<>();  //список повторяющихся слов

        for(int i=0;i<words.length;i++){
            if(!counter.containsKey(words[i])){    //если counter не содержит слово из массива, то добавляем это слово
                counter.put(words[i], 1);          //в кач-ве ключа со значением 1
            }
            else{                                               //если слово из массива уже есть в counter,
                counter.put(words[i], counter.get(words[i])+1 ); //то прибавляем к ключу этого слова 1
            }
        }

        System.out.println("Words and their's quantity: ");
        for (Map.Entry<String, Integer> o : counter.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());    //вывод counter

            if (o.getValue() > 1){              //добавляем дупликаты в список
                duplicates.add(o.getKey());
            }
        }

        String listString = String.join(", ", duplicates);
        System.out.println("\nDuplicates: " + listString + "\n--------------------");

        //--------------------------------------------------------------------------

        PhoneBook book1 = new PhoneBook();

        book1.add("Johnson", "811111111111");
        book1.add("Johnson", "844444444444");
        book1.add("Johnson", "99999");
        book1.add("Smith", "82222222222");
        book1.add("Smith", "833333333333");
        book1.add("Trump", "8888888888");
        book1.add("Obama", "9897897754");
        //book1.add("Trump", "9090909090");
        book1.get("Trump");
        book1.get("Johnson");
        book1.get("Smith");

        book1.get("Bush");
        book1.get("Obama");
    }
}