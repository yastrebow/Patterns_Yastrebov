package ru.yastrebov.patterns_yastrebov.proxy;

//Proxy Создание класса который хранит название бд и "подключается" к ней по полному url.
//        Подключаться через proxy, который добавляет к названию полный адрес.
//        (через proxy обращаюсь к названию бд, вижу строчку подключено localhost:port/название бд)


public class MainProxy {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        ProxyDataBase proxyDataBase = new ProxyDataBase(dataBase);

        proxyDataBase.connect("localhost:8080/");
    }


}
