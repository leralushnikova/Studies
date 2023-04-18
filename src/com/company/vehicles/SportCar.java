package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(Driver driver, Engine engine){
        super(driver, engine);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public String toString(){
        return "марка автомобиля - " + super.getCarBrand()+
                "\nкласс автомобиля - " + super.getCarClass() +
                "\nвес автомобиля - " + super.getWeight() +
                "\nпредельная скорость - " + getSpeed() +
                "\nИнформация о двигателе: \nмощность - " + super.engine.getPower() +
                "\nпроизводитель - " + super.engine.getCompany() +
                "\nДанные о водителе : \nФИО - " + super.driver.getFullName()+
                "\nстаж вождения - " + super.driver.getExperience() + " лет" ;
    }
}
