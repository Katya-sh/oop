package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;

public class EmployeeService implements iPersonService<Employee> {

    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return this.employees;
    }

    @Override
    public void create(String name, int age) {
        Employee newEmployee = new Employee(name, age, "разнорабочий");
        this.count++;
        this.employees.add(newEmployee);
    }

    public void sortByFIO()
    {
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }
}
