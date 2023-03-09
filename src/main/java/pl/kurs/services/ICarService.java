package pl.kurs.services;

import pl.kurs.model.Car;

import java.util.List;

public interface ICarService {
    Car getCarWithTheMostPower(List<Car> cars);
}
