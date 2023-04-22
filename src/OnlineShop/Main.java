package OnlineShop;

public class Main {
    public static void main(String[] args) {
        Goods goods1 = new Goods("молоко", 75.9, 4.8);
        Goods goods2 = new Goods("сметана", 50, 4);
        Goods goods3 = new Goods("йогрут", 35, 4.3);
        Goods goods4 = new Goods("мыло для рук", 150, 5);
        Goods goods5 = new Goods("гель для душа", 216.5, 3);
        Goods goods6 = new Goods("шампунь", 315, 4.5);
        Goods goods7 = new Goods("картошка", 25.5, 3.5);
        Goods goods8 = new Goods("яблоки", 55, 4.1);
        Goods goods9 = new Goods("огурцы", 85, 3.1);
        Goods goods10 = new Goods("кефир", 115.6, 4.7);
        Goods[] goods = {goods1, goods2, goods3, goods4, goods5, goods6, goods7, goods8, goods9, goods10};

        final int n = 3;
        Category[] categories = new Category[n];
        categories[0] = new Dairy(goods1, goods2, goods3, goods10);
        categories[1] = new Foam(goods4, goods5, goods6);
        categories[2] = new Vegetables(goods7, goods8, goods9);

        for (Category category : categories) {
            category.catalog();
        }
        System.out.println("Всего в каталоге продуктов " +Goods.Stat.count);
        System.out.println();
        User user1 = new User("Лопаткин", "kdjfie");
        User user2 = new User("Веточкин", "kdjlagh");
        User user3 = new User("Ложкин", "ksjhdga");
        User[] users = {user1, user2, user3};
        for (User user : users) {
            user.informationPerson();
        }
        System.out.println();
        Basket basket1 = new Basket(goods1, goods4, goods5, goods6);
        Basket basket2 = new Basket(goods6, goods9, goods10);
        Basket basket3 = new Basket(goods2, goods3, goods7, goods8);

        users[0].setBasket(basket2);
        users[1].setBasket(basket1);
        users[2].setBasket(basket3);

        for (User user : users) {
            user.getBuy();
            System.out.println();
        }


    }
}
