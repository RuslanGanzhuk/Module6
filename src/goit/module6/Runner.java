/*
антипаттерн состоит в неуклежем написании кода
Возможно код можно было написать гораздо удобней для чтения
 */

package goit.module6;

import goit.module6.musicShop.*;

public class Runner {

    public static void main(String[] arg) {
        MusicShop musicShop = new MusicShop();

        Order order = new Order(musicShop);
        order.createOrder();
        order.printOrder();
    }
}




















