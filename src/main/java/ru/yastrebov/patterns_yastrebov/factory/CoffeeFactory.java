package ru.yastrebov.patterns_yastrebov.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String kind, String country, String roasting, int strength){
        if("Americano".equalsIgnoreCase(kind)) {
            return new Americano(country, roasting, strength);
        }
        else {
            if ("Espresso".equalsIgnoreCase(kind)) {
                return new Espresso(country, roasting, strength);
            }
        }
            return null;
    }
}
