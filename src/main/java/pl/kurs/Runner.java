package pl.kurs;

import pl.kurs.model.Car;
import pl.kurs.model.Employee;
import pl.kurs.services.CarService;
import pl.kurs.services.EmployeeService;
import pl.kurs.services.ICarService;
import pl.kurs.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        IEmployeeService employeeService = new EmployeeService();
        ICarService carService = new CarService();

        Employee employee1 = new Employee("Jan", "Kowalski", 23000);
        Employee employee2 = new Employee("Tomasz", "Nowak", 28500);

        List<Employee> employees = new ArrayList<>(List.of(employee1, employee2));

        System.out.println(employeeService.getEmployeeWithHighestSalary(employees));

        Car car1 = new Car("Mercedes", "CLA", 2022, 260);
        Car car2 = new Car("BMW", "M3 Competition", 2022, 510);

        List<Car> cars = new ArrayList<>(List.of(car1, car2));

        System.out.println(carService.getCarWithTheMostPower(cars));

    }
}
