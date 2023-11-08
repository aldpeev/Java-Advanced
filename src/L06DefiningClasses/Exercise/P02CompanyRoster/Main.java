package L06DefiningClasses.Exercise.P02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Employee>> employeeMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] data = scanner.nextLine().split(" ");

            Employee currentEmployee = null;

            if (data.length == 4) {
                currentEmployee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3]);
            } else if (data.length == 5){
                if (data[4].contains("@")){
                    currentEmployee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4]);
                } else {
                    currentEmployee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                }

            } else {
                currentEmployee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4], Integer.parseInt(data[5]));
            }

            String department = currentEmployee.getDepartment();

            employeeMap.putIfAbsent(department, new ArrayList<>());
            employeeMap.get(department).add(currentEmployee);
        }

        String highestDepartment = null;
        double highestAvg = Double.MIN_VALUE;

        for (Map.Entry<String, List<Employee>> employeesByDepartment : employeeMap.entrySet()) {

            double sum = 0;
            for (Employee employee : employeesByDepartment.getValue()) {
                sum += employee.getSalary();
            }

            double currentAvg = sum / employeesByDepartment.getValue().size();
            if (currentAvg > highestAvg) {
                highestAvg = currentAvg;
                highestDepartment = employeesByDepartment.getKey();
            }
        }

        System.out.printf("Highest Average Salary: %s%n", highestDepartment);
        List<Employee> highestSalaryEmployee = employeeMap.get(highestDepartment);

        highestSalaryEmployee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

    }
}
