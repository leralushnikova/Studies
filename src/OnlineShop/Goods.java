package OnlineShop;

public class Goods {
    private String name;
    private double price;
    private double rating;
    private final double MAX_RATING = 5;


    public Goods(String name, double price, double rating) {
        if(isRating(rating)) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }
    }

    public double getPrice() {
        return price;
    }

    private boolean isRating(double rating) {
        return 0 < rating && rating <= MAX_RATING;
    }

    public String getName() {
        return name;
    }

    public String aboutGood(){
        return name + "\t" + price + " руб.\tрейтинг: " + rating;
    }
}
