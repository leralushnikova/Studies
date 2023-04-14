package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89562566325", "Apple");
        phone1.receiveCall("Mother");
        phone1.receiveCall("Mother", "+76522563654");
        phone1.sendMessage("Take your phone", "895132566", "656665236", "866455");
    }

}

