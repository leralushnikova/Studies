package OnlineShop;


public class Category {
    private String name;
    protected Goods[] goods ;

    public Category(String name, Goods... goods) {
        this.name = name;
        this.goods = goods;
    }
    public void catalog(){
        System.out.println(name + ": ");
        for (Goods good : goods) {
            System.out.println(good.aboutGood());
        }
        System.out.println();
    }
}
