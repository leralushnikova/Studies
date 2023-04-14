package Phone;

import java.lang.reflect.Array;

class Phone{
    private String number, model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " " + number);
        System.out.println("My number is " + this.number);
    }

    public void sendMessage(String message, String... array) {
        System.out.print("Message: " +message+" ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
