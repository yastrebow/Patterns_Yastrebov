package ru.yastrebov.patterns_yastrebov.factory;

public class Americano extends Coffee {

    private final String country;
    private final String roasting;
    private final int strength;

    public Americano(String country, String roasting, int strength) {
        this.country = country;
        this.roasting = roasting;
        this.strength = strength;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public String getRoasting() {
        return this.roasting;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }
}
