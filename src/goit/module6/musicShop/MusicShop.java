package goit.module6.musicShop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MusicShop {


    public Map<String, Integer> instruments = new HashMap<>();

    public MusicShop() {
        welcomeToShop();
        createListInstrument();
        printInstrument();
    }

    public void welcomeToShop(){

        System.out.println("Hello,welcome to our music shop 'GoIt'");
        System.out.println("Discover our range : ");
    }

    public void createListInstrument() {

        instruments.put(new Piano().getName(), 90);
        instruments.put(new Guitar().getName(), 100);
        instruments.put(new Trumpet().getName(), 130);
    }
    public void printInstrument(){

        Iterator iterator = instruments.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry) iterator.next();
            System.out.println("Assortiment "+ pair.getKey()+ " in our shop: " + pair.getValue());
        }

    }


}





