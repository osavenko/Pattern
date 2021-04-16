package ua.savenko.creational.fabricamethod.two.factory;

import ua.savenko.creational.fabricamethod.two.domain.Noname;
import ua.savenko.creational.fabricamethod.two.domain.Phone;

public class NonameFactory implements BrandFactory {

    @Override
    public Phone create(String modelName) {
        return new Noname(modelName);
    }
}
