package OnlineShop;

public class User {
    private String login, password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void informationPerson() {
        System.out.println("login: " + login +"\npassword: " + password);
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void getBuy(){
        System.out.println(login + " совершил покупки");
        basket.purchases();
    }
}
