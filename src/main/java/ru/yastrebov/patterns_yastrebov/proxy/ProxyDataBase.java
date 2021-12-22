package ru.yastrebov.patterns_yastrebov.proxy;

public class ProxyDataBase {

    private DataBase dataBase;

    public ProxyDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public void connect(String url) {
        System.out.println("Подключено " + url + dataBase.dataBaseName);
    }
}
