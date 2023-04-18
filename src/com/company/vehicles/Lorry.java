package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(Driver driver, Engine engine){
        super(driver, engine);
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
    @Override
    public String toString(){
        return  "марка грузовика - " + super.getCarBrand()+
                "\nкласс грузовика - " + super.getCarClass() +
                "\nвес грузовика - " + super.getWeight() +
                "\nгрузоподъемность кузова - " + getCarrying() +
                "\nИнформация о двигателе: \nмощность - " + super.engine.getPower() +
                "\nпроизводитель - " + super.engine.getCompany() +
                "\nДанные о водителе : \nФИО - " + super.driver.getFullName()+
                "\nстаж вождения - " + super.driver.getExperience() + " лет" ;
    }
}
