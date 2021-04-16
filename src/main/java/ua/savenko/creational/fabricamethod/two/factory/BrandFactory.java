package ua.savenko.creational.fabricamethod.two.factory;

import ua.savenko.creational.fabricamethod.two.domain.Phone;

public interface BrandFactory{
    Phone create(String modelName);
}
