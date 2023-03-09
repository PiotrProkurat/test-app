package pl.kurs.services;

import pl.kurs.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee getEmployeeWithHighestSalary(List<Employee> employees);
}
