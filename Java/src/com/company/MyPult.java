package com.company;

public class MyPult implements MyPultInterface {

    @Override
    public void TVOn() {
        System.out.println("TV on");

    }

    @Override
    public void TVOff(String TVOff) {
        System.out.println("TV off");

    }

    @Override
    public void VolumePlus() {
        System.out.println("Volume +");

    }

    @Override
    public void VolumeMinus() {
        System.out.println("Volume -");

    }

    @Override
    public void ChannelPlus() {
        System.out.println("Channel +");

    }

    @Override
    public void ChannelMinus() {
        System.out.println("Channel -");

    }
}
