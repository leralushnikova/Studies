package Animal;

public class Vet {
    Animal animal;
    public void treatAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное по имени - " + animal.getName());
        animal.getDescription();
    }
}
