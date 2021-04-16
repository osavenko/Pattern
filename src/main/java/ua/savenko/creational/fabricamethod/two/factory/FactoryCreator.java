package ua.savenko.creational.fabricamethod.two.factory;

public class FactoryCreator {

    public static BrandFactory getFactory(String text){
        switch (BrandType.get(text)){
            case APPLE:
                return new AppleFactory();
            case SAMSUNG:
                return new SamsungFactory();
        }
        return new NonameFactory();
    }
}
