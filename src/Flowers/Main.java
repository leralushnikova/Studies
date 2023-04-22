package Flowers;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        Flower[] flowers = new Flower[n];
        flowers[0] = new Roses("Germany", 5, 120);
        flowers[1] = new Carnations("Russia", 7, 50);
        flowers[2] = new Tulips("Australia", 4, 160);


        Bouquet[] bouquets = new Bouquet[3];
        bouquets[0] = new Bouquet(flowers[0], flowers[0], flowers[0], flowers[0], flowers[0]);
        bouquets[1] = new Bouquet(flowers[2], flowers[2], flowers[2]);
        bouquets[2] = new Bouquet(flowers[1], flowers[1], flowers[1], flowers[1]);
        for (Bouquet bouquet : bouquets) {
            bouquet.priceBouquet();
        }
        System.out.println(Bouquet.counterSellFlowers() );

    }
}
