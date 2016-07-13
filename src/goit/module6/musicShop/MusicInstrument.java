package goit.module6.musicShop;

import java.util.*;

public class MusicInstrument {

    public static Map<String, Integer> instrument = new HashMap<>();

    public static void createListInstrument() {

        instrument.put(Piano.getNamePiano(), 90);
        System.out.println("Assortiment Piano in our shop: " + instrument.get(Piano.getNamePiano()));
        instrument.put(Guitar.getNameGuitar(), 100);
        System.out.println("Assortiment Guitar in our shop: " + instrument.get(Guitar.getNameGuitar()));
        instrument.put(Trumpet.getNameTrumpet(), 130);
        System.out.println("Assortiment Trumpet in our shop: " + instrument.get(Trumpet.getNameTrumpet()));
    }
}
