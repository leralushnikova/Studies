package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        driver1.setFullName("Федор Иванович Приходько");
        driver1.setExperience(30);
        Engine engine1 = new Engine();
        engine1.setCompany("Audi");
        engine1.setPower(5);

        Driver driver2 = new Driver();
        driver2.setFullName("Иван Иванович Иванов");
        driver2.setExperience(15);
        Engine engine2 = new Engine();
        engine2.setCompany("BMW");
        engine2.setPower(10);

        Lorry lorry1 = new Lorry(driver1, engine1);
        SportCar sportCar1 = new SportCar(driver2, engine2);
        lorry1.setCarBrand("Audi");
        lorry1.setCarClass("A");
        lorry1.setWeight(156.9);
        lorry1.setCarrying(15);
        sportCar1.setCarBrand("BMW");
        sportCar1.setCarClass("C");
        sportCar1.setWeight(115);
        sportCar1.setSpeed(300);
        lorry1.start();
        lorry1.stop();
        lorry1.turnLeft();
        lorry1.turnRight();
        System.out.println();
        System.out.println(sportCar1.toString());
        System.out.println();
        Lorry lorry2 = new Lorry(driver2, engine2);
        lorry2.setCarBrand("fgsdgs");
        lorry2.setCarClass("v");
        lorry2.setWeight(562);
        lorry2.setCarrying(10);
        System.out.println(lorry1.toString());
        System.out.println();
        System.out.println(lorry2.toString());

    }
}
