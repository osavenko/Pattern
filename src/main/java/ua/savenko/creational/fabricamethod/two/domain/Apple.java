package ua.savenko.creational.fabricamethod.two.domain;

public class Apple extends Phone {

    public Apple(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "Model:'" + name + '\'' +
                ", sSN:'" + sn + '\'' +
                '}';
    }
}
