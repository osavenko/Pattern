package ua.savenko.creational.fabricamethod.one.fabrics;

import ua.savenko.creational.fabricamethod.one.domain.Decepticon;
import ua.savenko.creational.fabricamethod.one.domain.Transformer;
import ua.savenko.creational.fabricamethod.one.util.ConsoleUtils;

public class FaricaDecepticons implements FabricaTransformer {
    public Transformer create() {
        Decepticon decepticon = new Decepticon();

        decepticon.setName(ConsoleUtils.readName("десептикона"));

        return decepticon;
    }
}
