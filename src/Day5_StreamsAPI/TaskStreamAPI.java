package Day5_StreamsAPI;
import java.util.*;
import java.util.stream.Collectors;

public class TaskStreamAPI {
    public static void main(String[] args) {
        List<Employee> listEmployee= new ArrayList<>(Arrays.asList(
                new Employee("Tanay", 1, 20000, "EPD"),
                new Employee("Abhisekh", 2, 30000, "EPD"),
                new Employee("Tanishq", 3, 30000, "AI/ML"),
                new Employee("Priyanshu", 4, 60000, "Data Science"),
                new Employee("Anurag", 5, 70000, "EPD"),
                new Employee("Kapil", 6, 50000, "Data Science"),
                new Employee("Sahil", 7, 30000, "AI/ML")
        ));

        List<String> highSalaryEmployeeNames= listEmployee.stream()
                .filter(emp->emp.getSalary()>50000)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList();

        System.out.println("Employees with Salary > 50000, sorted and mapped in single pipeline");
        highSalaryEmployeeNames.forEach(System.out::println);
    }
}
