package ru.yastrebov.patterns_yastrebov.adapter;

public class Computer {

    public void read(Port port) {
        System.out.println("Device detected: " + port.connect());
    }
}
