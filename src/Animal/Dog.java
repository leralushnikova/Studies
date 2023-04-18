package Animal;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Собака лает");
    }
    @Override
    public void eat() {
        System.out.println("Собака питается: кормом для собак");
    }
    @Override
    public void getDescription() {
        System.out.println("Описание собаки");
    }
}
