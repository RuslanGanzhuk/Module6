package goit.module6.musicShop;

import java.util.*;

public class Order {

    private  final MusicShop musicShop;

    private final Scanner scanner = new Scanner(System.in);

    public Order(MusicShop musicShop) {
        this.musicShop = musicShop;
    }

    public void createOrder() {

        try {
            System.out.println("Enter please your order on Piano: ");

            int numberPiano = 0;
            boolean positiveIntPiano = false;

            while (!positiveIntPiano) {
                numberPiano = scanner.nextInt();
                if (numberPiano < 0) {
                    System.out.println("Your order is not correct.Please try again");
                } else if (numberPiano > musicShop.instruments.get(new Piano().getName())) {
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
                } else if (numberGuitar > musicShop.instruments.get(new Guitar().getName())){
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
                } else if (numberTrumpet > musicShop.instruments.get(new Trumpet().getName())){
                    System.out.println("Your number > our assortiment.Please try again");
                } else {
                    positiveIntTrumpet = true;
                }
            }

            Map<String, Integer> order = new HashMap<>();
            order.put(new Piano().getName(), numberPiano);
            order.put(new Guitar().getName(), numberGuitar);
            order.put(new Trumpet().getName(), numberTrumpet);

            //Map<String, Integer> balance = new HashMap<>();
            musicShop.instruments.put(new Piano().getName(), musicShop.instruments.get(new Piano().getName()) - numberPiano);
            System.out.println("Balance Piano in our shop: " + musicShop.instruments.get(new Piano().getName()));
            musicShop.instruments.put(new Guitar().getName(), musicShop.instruments.get(new Guitar().getName()) - numberGuitar);
            System.out.println("Balance Guitar in our shop: " + musicShop.instruments.get(new Guitar().getName()));
            musicShop.instruments.put(new Trumpet().getName(), musicShop.instruments.get(new Trumpet().getName()) - numberTrumpet);
            System.out.println("Balance Trumpet in our shop: " + musicShop.instruments.get(new Trumpet().getName()));
        }
          catch ( Exception ex){
              System.out.println(" WARNING!!! Your order shall be just a number.");
          }
        }

    /*public void testMetod() {

        int numberInsrument;
        boolean positiveIntInstrument = false;

        while (!positiveIntInstrument) {
            numberInsrument = scanner.nextInt();
            if (numberInsrument < 0) {
                System.out.println("Your order is not correct.Please try again");
            } else if (numberInsrument > instruments.get(Piano.getNamePiano())) {
                System.out.println("Your number > our assortiment.Please try again");
            } else {
                positiveIntInstrument = true;
            }
        }
    }*/
}





