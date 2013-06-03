package com.usta.cdied;

import javax.decorator.*;
import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 03.06.2013
 * Time: 14:55
 * To change this template use File | Settings | File Templates.
 */
@javax.decorator.Decorator
public class WithAds implements Ebook {

    @Inject
    @Delegate
    Ebook ebook;

    public void powerOn() {
        System.out.println("Reklamlı Kindle açılacak..");
        ebook.powerOn();
    }

    public void powerOff() {
        ebook.powerOff();
    }

    public void nextPage() {
        System.out.println("Sayfa aralarında reklamlar..");
        ebook.nextPage();
    }
}
