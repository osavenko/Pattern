package ua.savenko.creational.fabricamethod.two;

import ua.savenko.creational.fabricamethod.two.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Phone> phones = new ArrayList<>();//Строку менять нельзя
        //загрузить все модели из файла D:\order.list в phones

        phones.stream().forEach(System.out::println);//Строку менять нельза
    }
}
