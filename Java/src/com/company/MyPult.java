package com.company;

public class MyPult implements MyPultInterface {
    String TVOn;
    String TVOff;
    String VolumePlus;
    String VolumeMinus;
    String ChannelPlus;
    String ChannelMinus;

    MyPult (String TVOn, String TVOff){
        this.TVOn = TVOn;
        this.TVOff = TVOff;
    }

    @Override
    public String TVOn(String TVOn) {
        return null;
    }

    @Override
    public String TVOff(String TVOff) {
        return null;
    }

    @Override
    public String VolumePlus(String VolumePlus) {
        return null;
    }

    @Override
    public String VolumeMinus(String VolumeMinus) {
        return null;
    }

    @Override
    public String ChannelPlus(String ChannelPlus) {
        return null;
    }

    @Override
    public String ChannelMinus(String ChanelMinus) {
        return null;
    }
}
