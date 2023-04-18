package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car{
    private String carBrand, carClass;
    private double weight;
    protected Driver driver;
    protected Engine engine;

    public Car(Driver driver, Engine engine) {
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Поехали!");
    }
    public void stop(){
        System.out.println("Останавливаемся!");
    }
    public void turnRight(){
        System.out.println("Поворот направо!");
    }
    public void turnLeft(){
        System.out.println("Поварот налево!");
    }
    @Override
    public String toString(){
        return "марка автомобиля - " + carBrand +
                "\nкласс автомобиля - " + carClass +
                "\nвес автомобиля - " + weight +
                "\nИнформация о двигателе: \nмощность - " + engine.getPower() +
                "\nпроизводитель - " + engine.getCompany() +
                "\nДанные о водителе : \nФИО - " + driver.getFullName()+
                "\nстаж вождения - " + driver.getExperience() + " лет";
    }
}
