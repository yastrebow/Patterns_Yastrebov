package ru.yastrebov.patterns_yastrebov.singleton;

public class MainSingleton {

    public static void main(String[] args) {

        MainSingleton example = new MainSingleton();

       Logger.getLogger().addClassName(example);
        Logger.getLogger().addClassName(example);
        Logger.getLogger().addClassName(example);
        Logger.getLogger().addClassName(example);

        Logger.getLogger().printLogString();



    }

}
