package ua.savenko.creational.fabricamethod.one.fabrics;

import ua.savenko.creational.fabricamethod.one.domain.Functionalist;
import ua.savenko.creational.fabricamethod.one.domain.Transformer;

public class FabricaFunctionalist implements FabricaTransformer {
    @Override
    public Transformer create() {
        return new Functionalist();
    }
}
