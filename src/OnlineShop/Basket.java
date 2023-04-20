package OnlineShop;

public class Basket {
private Goods[] goods;

    public Basket(Goods... goods) {
        this.goods = goods;
    }
    public void purchases(){
        double a = 0;
        for (Goods good : goods) {
            System.out.println(good.getName() + "\t" + good.getPrice());
            a += good.getPrice();
        }
        System.out.println("Общая стоимость покупок = " + a);
    }
}
