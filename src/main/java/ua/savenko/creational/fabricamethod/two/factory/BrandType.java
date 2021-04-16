package ua.savenko.creational.fabricamethod.two.factory;

public enum BrandType {
    SAMSUNG, APPLE, NONAME;

    public static BrandType get(String text) {
        switch (text.toLowerCase()){
            case "apple":
                return APPLE;
            case "samsung":
                return  SAMSUNG;
        }
        return BrandType.NONAME;
    }
}
