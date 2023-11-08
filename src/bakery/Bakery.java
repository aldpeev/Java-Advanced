package bakery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bakery {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        employees = new ArrayList<>();
    }

    public void add(Employee employee){
        if (employees.size() < capacity){
            employees.add(employee);
        }
    }

    public boolean remove (String name){
        return employees.removeIf(e -> e.getName().equals(name));
    }

    public Employee getOldestEmployee(){
        return Collections.max(employees, Comparator.comparingInt(Employee::getAge));
    }

    public Employee getEmployee (String name){
        for (Employee employee : employees) {
            if (employee.getName().equals(name)){
                return employee;
            }
        }

        return null;
    }

    public int getCount (){
        return employees.size();
    }

    public String report(){
//        o	"Employees working at Bakery {bakeryName}:
//        {Employee1}
//        {Employee2}
//        (…)"

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employees working at Bakery %s:", name));
        sb.append(System.lineSeparator());

        for (Employee employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }
        return sb.toString();

    }

}
