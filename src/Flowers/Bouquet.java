package Flowers;

public class Bouquet {
    private Flower[] flowers;
    private static int n;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public void priceBouquet(){
        int a = 0;
        for(Flower flower : flowers){
            a += flower.getPrice();
            n++;
        }
        System.out.println(a);
    }

    public static int counterSellFlowers(){
        return n;
    }
}
