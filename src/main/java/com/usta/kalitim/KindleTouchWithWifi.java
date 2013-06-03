package com.usta.kalitim;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 15.05.2012
 * Time: 09:26
 * To change this template use File | Settings | File Templates.
 */
public class KindleTouchWithWifi extends KindleTouch{
    @Override
    void powerOn() {
        super.powerOn();
        System.out.println("Wifi açılıyor...");
        System.out.println("Wifi açıldı..");
    }
}
