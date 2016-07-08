package goit.module6.musicShop;

import java.util.*;

import static goit.module6.musicShop.MusicInstrument.instrument;
import static goit.module6.musicShop.Trumpet.getNameTrumpet;

public class Order {

    public static void createOrder() {

        Scanner scanner = new Scanner(System.in);

        try {



            System.out.println("Enter please your order on Piano: ");

            int numberPiano = 0;
            boolean positiveIntPiano = false;

            while (!positiveIntPiano) {
                numberPiano = scanner.nextInt();

                if (numberPiano < 0) {
                    System.out.println("Your order is not correct.Please try again");
                }
                    else if (numberPiano > 90) {
                         System.out.println("Your number > our assortiment.Please try again");
                     } else {
                             positiveIntPiano = true;
                             }
            }

            System.out.println("Enter please your order on Guitar: ");

            int numberGuitar = 0;
            boolean positiveIntGuitar = false;

            while (!positiveIntGuitar) {
                numberGuitar = scanner.nextInt();

                if (numberGuitar < 0) {
                    System.out.println("Your order is not correct.Please try again");
                   } else if (numberGuitar > 100){
                       System.out.println("Your number > our assortiment.Please try again");
                     } else {
                        positiveIntGuitar = true;
                            }
            }

            System.out.println("Enter please your order on Trumpet: ");

            int numberTrumpet = 0;
            boolean positiveIntTrumpet = false;

            while (!positiveIntTrumpet) {
                numberTrumpet = scanner.nextInt();

                if (numberTrumpet < 0) {
                    System.out.println("Your order is not correct.Please try again");
                }
                    else if (numberTrumpet > 130){
                        System.out.println("Your number > our assortiment.Please try again");
                         } else {
                             positiveIntTrumpet = true;
                                }
            }

            Map<String, Integer> order = new HashMap<>();
            order.put(Piano.getNamePiano(), numberPiano);
            order.put(Guitar.getNameGuitar(), numberGuitar);
            order.put(getNameTrumpet(), numberTrumpet);

            Map<String, Integer> balance = new HashMap<>();
            instrument.put(Piano.getNamePiano(), 90 - numberPiano);
            System.out.println("Balance Piano in our shop: " + instrument.get(Piano.getNamePiano()));
            instrument.put(Guitar.getNameGuitar(), 100 - numberGuitar);
            System.out.println("Balance Guitar in our shop: " + instrument.get(Guitar.getNameGuitar()));
            instrument.put(getNameTrumpet(), 130 - numberTrumpet);
            System.out.println("Balance Trumpet in our shop: " + instrument.get(getNameTrumpet()));
        }
          catch ( Exception ex){
              System.out.println(" WARNING!!! Your order shall be just a number.");
          }
        }
    }





