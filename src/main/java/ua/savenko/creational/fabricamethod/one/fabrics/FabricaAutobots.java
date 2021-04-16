package ua.savenko.creational.fabricamethod.one.fabrics;

import ua.savenko.creational.fabricamethod.one.domain.Autobot;
import ua.savenko.creational.fabricamethod.one.domain.Transformer;
import ua.savenko.creational.fabricamethod.one.util.ConsoleUtils;

public class FabricaAutobots implements FabricaTransformer{
    public Transformer create() {
        Autobot autobot = new Autobot();

        autobot.setName(ConsoleUtils.readName("автобота"));

        return autobot;
    }
}
