package ru.yastrebov.patterns_yastrebov.adapter;

//Adapter Компьютер может читать информацию только с USB,
//нужно прочитать через usb адаптер информацию с карты памяти.
// (создаю карту, адаптер и с компьютера читаю)


import ru.yastrebov.patterns_yastrebov.singleton.Logger;
import ru.yastrebov.patterns_yastrebov.singleton.MainSingleton;

public class MainAdapter {

    public static void main(String[] args) {

        Port portUsb = new UsbPort();
        Computer pc = new Computer();
        pc.read(portUsb);

        SdCard sdCard = new SdCard();
        SdCardAdapter sdCardAdapter = new SdCardAdapter(sdCard);
        pc.read(sdCardAdapter);
    }


}
