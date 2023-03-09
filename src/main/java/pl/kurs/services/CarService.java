package pl.kurs.services;

import pl.kurs.exceptions.CarNotFoundException;
import pl.kurs.model.Car;

import java.util.*;

public class CarService implements ICarService{
    @Override
    public Car getCarWithTheMostPower(List<Car> cars) {
        return Optional.ofNullable(cars)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Car::getPower))
                .orElseThrow(() -> new CarNotFoundException("Car with the most power not found"));
    }
}
