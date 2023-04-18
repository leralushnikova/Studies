package Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Пушок");
        Cat cat =new Cat();
        cat.setName("Гав");
        Bear bear = new Bear();
        bear.setName("Соня");
        Animal[] animals = {cat, dog, bear};
        Vet v1 = new Vet();
        v1.treatAnimal(cat);
        Vet v2 = new Vet();
        v2.treatAnimal(dog);
        Vet v3 = new Vet();
        v3.treatAnimal(bear);
        for (Animal a : animals) {
            a.eat();
            a.makeNoise();
        }

    }
}
