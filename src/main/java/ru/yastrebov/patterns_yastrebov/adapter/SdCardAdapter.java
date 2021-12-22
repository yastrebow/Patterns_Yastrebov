package ru.yastrebov.patterns_yastrebov.adapter;

public class SdCardAdapter implements Port{

    protected SdCard card;

    public SdCardAdapter(SdCard card){
        this.card = card;
    }
    public String connect() {
        return card.work();
    }
}
