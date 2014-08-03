package com.mrcodeninja.java8.stream;

/**
 * @author mrcodeninja
 */
class Car {
    private CarClass carClass;
    private CarMake carMake;
    private String name;

    public Car(CarClass carClass, CarMake carMake, String name) {
        this.carClass = carClass;
        this.carMake = carMake;
        this.name = name;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
