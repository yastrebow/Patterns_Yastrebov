package ru.yastrebov.patterns_yastrebov.factory;

//Factory Создать класс кофе, от него наследовать два вида кофе,
//в зависимости от того какой тип кофе мы хотим, создавать именно его через фабрику. (espresso, americano)


public class MainFactory {
    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.getCoffee("AMERICANO", "Brazil", "middle", 3);
        Coffee espresso = CoffeeFactory.getCoffee("espresso", "Columbia", "strong", 5);
        System.out.println("Factory Americano choice: " + americano);
        System.out.println("Factory Espresso choice: " + espresso);

        System.out.println(americano instanceof Americano);
        System.out.println(espresso instanceof Espresso);

    }

}
