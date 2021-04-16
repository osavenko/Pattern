package ua.savenko.creational.fabricamethod.one.util;

import java.util.Scanner;

public class ConsoleUtils {
    public static String readName(String text){
        System.out.print("Введите имя "+text+": ");
        return getString();
    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void printMenu(){
        System.out.println("Кого будем создавать:");
        System.out.println("Autobot");
        System.out.println("Decepticon");
        System.out.println("Functionalist");
        System.out.println("exit");
    }

}
