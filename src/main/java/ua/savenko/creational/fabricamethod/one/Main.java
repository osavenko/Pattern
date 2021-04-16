package ua.savenko.creational.fabricamethod.one;

import ua.savenko.creational.fabricamethod.one.domain.Transformer;
import ua.savenko.creational.fabricamethod.one.fabrics.CreaterFabrica;
import ua.savenko.creational.fabricamethod.one.fabrics.FabricaTransformer;
import ua.savenko.creational.fabricamethod.one.util.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transformer> list = new ArrayList<>();
        //Создаем фабрику
        FabricaTransformer fabricaAutobots;
        String textComman = "";

        //Счыитывать кого создаем
        do {
            ConsoleUtils.printMenu();
            textComman = ConsoleUtils.getString();

            fabricaAutobots = CreaterFabrica.create(textComman);
            if (fabricaAutobots!=null){
                list.add(fabricaAutobots.create());
            }
        } while (!textComman.toLowerCase().equals("exit"));
        //Выводим список
        list.stream().forEach(t -> {
            System.out.println(t.getName());
        });
    }
}
