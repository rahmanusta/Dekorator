package com.usta.cdied;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 22.04.2012
 * Time: 03:51
 * To change this template use File | Settings | File Templates.
 */

public class Tester {

    @Inject
    Ebook deco;

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer konteyner = weld.initialize();
        Tester tester = konteyner.instance().select(Tester.class).get();

        tester.deco.powerOn();
        tester.deco.nextPage();
        tester.deco.powerOff();

    }
}
