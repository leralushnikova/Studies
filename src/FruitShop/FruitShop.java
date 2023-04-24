package FruitShop;

public abstract class FruitShop {
    private double weight;
    protected double price;
    public static double allPrice;

    public FruitShop(double weight, double price) {
        this.weight = weight;
        this.price = price;
        allPrice += (price*getWeight());
    }

    public abstract double getPrice();


    public void printManufacturerInfo() {
        System.out.println("Made in Russia!");
    }

    public double getWeight() {
        return weight;
    }

}
