package ua.savenko.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog;
        Dog dog1 = new Dog("Тузик", "Доберман", 4);
        System.out.println(dog1);
        dog = (Dog) dog1.clone();
        List<Dog> lists = new ArrayList<Dog>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            //Dog dogg = new Dog();
            lists.add(dog1.cloneBreed());
        }
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
}
/*
2074500
2742500
3672100

10527500
15403800
11677600

103712400
102228900
102178200
 */