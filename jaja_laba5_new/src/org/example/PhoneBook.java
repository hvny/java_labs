package org.example;
import java.util.*;
public class PhoneBook {
    private Map<String, ArrayList<String>> phonebook;   //фамилия - строка, номер - список строк,
    //т.к. намеров может быть несколько
    PhoneBook() {
        phonebook = new TreeMap<>();
    }

    public void printBook() {
        phonebook.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public void add(String surname, String number) {
        ArrayList<String> ListOfNumbers = new ArrayList<String>();
        ListOfNumbers.add(number);

        if (!phonebook.containsKey(surname)){         //если книга не содержит фамилию, то добавляем пару
            phonebook.put(surname, ListOfNumbers);    //фамилия : номер
        }
        else{                                         //если данная фамилия уже есть в книге, то добавляем ещё один номер к значению ключа
            if (phonebook.get(surname).contains(number)){ //проверка на наличие номера у в списке номеров конкретного человека
                System.out.println("The number '" + number +  "' has already been saved");
            }
            else {
                phonebook.get(surname).add(number);
            }
        }
    }
    public void get(String Surname){
        if (!phonebook.containsKey(Surname)){
            System.out.println("Surname '" + Surname + "' doesn't exist in phonebook.");
        }
        else {
            for (Map.Entry<String, ArrayList<String>> temp : phonebook.entrySet()) {
                if(temp.getKey().equals(Surname)) {                                //если ключ == нужная фамилия
                    System.out.println(temp.getKey() + " : " + temp.getValue());
                }
            }
        }
    }
}