package OnlineShop;

public class Goods {
    private String name;
    private double price;
    private double rating;
    private final double MAX_RATING = 5;
    private int id;

    {
        Stat.count++;
        id = ++Stat.id;
    }

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

    public int getId() {
        return id;
    }

    class Stat{
        public static int count = 0;
        public static int id = 0;
    }

}
