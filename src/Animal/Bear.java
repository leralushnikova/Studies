package Animal;

public class Bear extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Медведь рычит");
    }
    @Override
    public void eat() {
        System.out.println("Медведь питается: мясом, медом и рыбой");
    }
    @Override
    public void getDescription() {
        System.out.println("Описание медведя");
    }
}
