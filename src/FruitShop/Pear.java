package FruitShop;

public class Pear extends FruitShop{
    public static double allPricePear;
    public Pear(double weight, double price) {
        super(weight, price);
        allPricePear += (price * getWeight());
    }

    public double getPrice() {
        return price*getWeight();
    }
}
