package com.usta.kalitim;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 15.05.2012
 * Time: 09:13
 * To change this template use File | Settings | File Templates.
 */
public class Ebook {
    String str;

    public Ebook(String str) {
        this.str = str;
    }
    public Ebook(){}

    void powerOn(){
        System.out.println(str+" açıldı.");
    };
    void powerOff(){
        System.out.println(str+" kapatıldı..");
        System.out.println("-------------------------\n");
    };
    void nextPage(){
        System.out.println(str+" sonraki sayfaya geçirildi..");
    };
}
