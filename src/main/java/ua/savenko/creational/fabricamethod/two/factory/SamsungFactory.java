package ua.savenko.creational.fabricamethod.two.factory;

import ua.savenko.creational.fabricamethod.two.domain.Phone;
import ua.savenko.creational.fabricamethod.two.domain.Samsung;

public class SamsungFactory implements BrandFactory {

    @Override
    public Phone create(String modelName) {
        return new Samsung(modelName);
    }
}
