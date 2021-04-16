package ua.savenko.creational.fabricamethod.two.factory;

import ua.savenko.creational.fabricamethod.two.domain.Apple;
import ua.savenko.creational.fabricamethod.two.domain.Phone;

public class AppleFactory implements BrandFactory {

    @Override
    public Phone create(String modelName) {
        return new Apple(modelName);
    }
}
