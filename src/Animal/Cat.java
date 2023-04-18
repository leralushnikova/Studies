package Animal;

public class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Кошка мяучет");
    }
    @Override
    public void eat() {
        System.out.println("Кошка питается: кормом для кошек");
    }
    @Override
    public void getDescription() {
        System.out.println("Описание кошки");
    }
}
