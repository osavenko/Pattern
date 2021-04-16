package ua.savenko.creational.fabricamethod.one.fabrics;

public enum TypeFabrica {
    AUTOBOTS, DECEPTICONS, FUNCTIONALIST, NONAME;

    public static TypeFabrica get(String name){
        if(name.equals("autobot")){
            return TypeFabrica.AUTOBOTS;
        } else if(name.equals("decepticon")) {
            return TypeFabrica.DECEPTICONS;
        } else if (name.equals("Functionalist")) {
            return TypeFabrica.FUNCTIONALIST;
        }
        return TypeFabrica.NONAME;
    }
}
