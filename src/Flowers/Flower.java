package Flowers;

public class Flower {
    private String country;
    private int days;
    private double price;
    private int MAX_DAYS = 10;

    public Flower(String country, int days, double price) {
        if(isDays(days)) {
            this.country = country;
            this.days = days;
            this.price = price;
        }
    }

    private boolean isDays(int days) {
        return 1 < days && days <= MAX_DAYS;
    }

    public double getPrice() {
        return price;
    }
}
