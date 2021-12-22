package ru.yastrebov.patterns_yastrebov.factory;

public abstract class Coffee {

    public abstract String getCountry();
    public abstract String getRoasting();
    public abstract int getStrength();

    @Override
    public String toString() {
        return "country = " + getCountry() + ", roasting = " + getRoasting() + ", strength = " + getStrength();
    }

}
