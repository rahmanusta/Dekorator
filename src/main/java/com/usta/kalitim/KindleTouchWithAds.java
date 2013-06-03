package com.usta.kalitim;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 15.05.2012
 * Time: 09:23
 * To change this template use File | Settings | File Templates.
 */
public class KindleTouchWithAds extends KindleTouch{

    @Override
    void nextPage() {
        super.nextPage();
        System.out.println("En güzel e-kitaplar $1");
    }
}
