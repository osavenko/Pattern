package ua.savenko.creational.fabricamethod.one.fabrics;

public class CreaterFabrica {
    public static FabricaTransformer create(String typeFabrica){
        switch (TypeFabrica.get(typeFabrica)){
            case AUTOBOTS:
                return new FabricaAutobots();
            case DECEPTICONS:
                return new FaricaDecepticons();
            case FUNCTIONALIST:
                return new FabricaFunctionalist();
            default:return null;
        }
    }
}
