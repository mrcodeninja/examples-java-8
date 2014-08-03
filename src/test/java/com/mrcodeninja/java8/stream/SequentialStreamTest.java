package com.mrcodeninja.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author mrcodeninja
 */
public class SequentialStreamTest {
    private static final List<Car> CARS = Arrays.asList(
            new Car(CarClass.COMPACT, CarMake.MINI, "2014 MINI Cooper Hardtop"),
            new Car(CarClass.COMPACT, CarMake.VOLKSWAGEN, "2014 Volkswagen Jetta"),
            new Car(CarClass.HYBRID, CarMake.BMW, "2014 BMX i8"),
            new Car(CarClass.HYBRID, CarMake.LEXUS, "2014 Acura ILX Hybrid"),
            new Car(CarClass.HYBRID, CarMake.TOYOTA, "2014 Toyota Camry Hybrid"),
            new Car(CarClass.SPORT, CarMake.MCLAREN, "2015 McLaren 650S"),
            new Car(CarClass.SPORT, CarMake.LAMBORGHINI, "2014 Lamborghini Aventador")
    );

    @Test
    public void filterStreamForSportsCars() {
        Predicate<Car> sportsCar = (car) -> CarClass.SPORT.equals(car.getCarClass());

        CARS.stream()
                .filter(sportsCar)
                .forEach(car -> System.out.println(car.getName()));
    }

    @Test
    public void filterStreamForHybridCars() {
        Predicate<Car> sportsCar = (car) -> CarClass.HYBRID.equals(car.getCarClass());

        CARS.stream()
                .filter(sportsCar)
                .forEach(car -> System.out.println(car.getName()));
    }
}
