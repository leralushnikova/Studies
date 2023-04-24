package FruitShop;

public class Main {
    public static void main(String[] args) {
        final int n = 6;
        FruitShop[] fruitShops = new FruitShop[n];
        fruitShops[0] = new Apple(2, 52);
        fruitShops[1] = new Pear(3, 115);
        fruitShops[2] = new Apricot(1, 150);
        fruitShops[3] = new Apple(3, 52);
        fruitShops[4] = new Pear(1.5, 115);
        fruitShops[5] = new Apricot(2, 150);



        System.out.println(FruitShop.allPrice);
        System.out.println(Apple.allPriceApple);
        System.out.println(Pear.allPricePear);
        System.out.println(Apricot.allPriceApricot);

    }
}
