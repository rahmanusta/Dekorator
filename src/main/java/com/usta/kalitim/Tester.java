package com.usta.kalitim;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 15.05.2012
 * Time: 09:20
 * To change this template use File | Settings | File Templates.
 */
public class Tester {
    public static void main(String[] args) {

        KindleTouch kitap1=new KindleTouch();
        kitap1.powerOn();
        kitap1.nextPage();
        kitap1.powerOff();

        KindleTouchWithAds kitap2=new KindleTouchWithAds();
        kitap2.powerOn();
        kitap2.nextPage();
        kitap2.nextPage();
        kitap2.powerOff();
        
        KindleTouchWithWifi kitap3=new KindleTouchWithWifi();
        kitap3.powerOn();
        kitap3.nextPage();
        kitap3.powerOff();
    }
}
