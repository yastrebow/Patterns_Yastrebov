package ru.yastrebov.patterns_yastrebov.adapter;

public class UsbPort implements Port{

    @Override
    public String connect() {
        return "USB is ready";
    }
}
