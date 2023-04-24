package FruitShop;

public class Apple extends FruitShop{
    public static double allPriceApple;
    public Apple(double weight, double price) {
        super(weight, price);
        allPriceApple += (price * getWeight());
    }

    public double getPrice() {
        return price*getWeight();
    }
}
