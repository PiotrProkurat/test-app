package pl.kurs.services;

import pl.kurs.exceptions.EmployeeNotFoundException;
import pl.kurs.model.Employee;

import java.util.*;

public class EmployeeService implements IEmployeeService{
    @Override
    public Employee getEmployeeWithHighestSalary(List<Employee> employees) {
        return Optional.ofNullable(employees)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("Highest salary Employee not found"));
    }


}
