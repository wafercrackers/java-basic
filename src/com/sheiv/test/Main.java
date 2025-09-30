package com.sheiv.test;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // java basic 1

        // Primitive
        int number = 1;
        double decimalNumber = 10.5;
        boolean status = true;
        char letter = 'a';

        // Non Primitive
        String string = "Hello Universe";

        System.out.println("Hello World");
        int result = printMessage("Message1");
        System.out.println(result);

        // java basic 2

        /*String string1 = null;

        try {
            System.out.println(string1.substring(0));
        } catch (NullPointerException e) {
            System.out.println("I have errored");
            e.printStackTrace();
        }
*/
        String string2 = "whatever";
        SecondClass secondClass = new SecondClass(6);
        secondClass.method1();

        // java basic 3

        String[] array = new String[]{"test1", "test2", "test3"};
        int[] array2;
        double[] array3;
        Polygon[] array4;

        array[0] = "new value";
        System.out.println(array[0]);

        List<String> list = new ArrayList<>();

        list.add("test1");
        list.add("test2");

        System.out.println(list.get(1));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "test");
        map.put(1, "test1");

        for (int i = 0; i < map.size(); i++) {
            System.out.println("key :" + map.keySet().toArray()[i] + " | " + "value :" + map.values().toArray()[i]);
            System.out.println(i);
        }

        for (String string3 : array) {
            System.out.println(string3);
        }

        while (number < 5) {
            number++;
            System.out.println(number);
        }

        // java basic 4
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car(4, "Red"));
        vehicleList.add(new Motorbike(2, "Blue"));

        for (Vehicle vehicle : vehicleList) {
            vehicle.activateBrake();
        }

        CoffeeSize ordered = CoffeeSize.LARGE;
        System.out.println("customer has just ordered a " + ordered.getName() + " coffee for $" + ordered.getPrice() + ".");

        // java basic 5
        String word = "banana";

        if (word.equals("banana")) {
            System.out.println("Correct 1");
        } else if (word.equals("apple")) {
            System.out.println("Incorrect");
        }

        switch (word) {
            case "apple":
                System.out.println("Incorrect");
                break;
            case "banana":
                System.out.println("Correct 2");
                break;
            default:
                System.out.println("not found, exit method.");
                return;
        }

        System.out.println("finish switch");

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.DAY_OF_YEAR, -1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR));

        List<String> list2 = new ArrayList<>();
        list2.add("test1");
        list2.add("test2");
        list2.add("test3");
        list2.add("test4");

        Random random = new Random();
        System.out.println(list2.get(random.nextInt(list2.size())));
    }

    private static int printMessage(String message) {
        System.out.println(message);
        return 12;
    }

}
