package FruitShop;

public class Apricot extends FruitShop{
    public static double allPriceApricot;
    public Apricot(double weight, double price) {
        super(weight, price);
        allPriceApricot += (price * getWeight());
    }

    public double getPrice() {
        return price*getWeight();
    }
}
