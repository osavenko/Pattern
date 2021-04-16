package ua.savenko.creational.fabricamethod.one.domain;

public abstract class Transformer {
    private String name;
    private Gender gender;
    private Altmode altmode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Altmode getAltmode() {
        return altmode;
    }

    public void setAltmode(Altmode altmode) {
        this.altmode = altmode;
    }
}
