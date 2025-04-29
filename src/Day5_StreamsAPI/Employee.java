package Day5_StreamsAPI;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;

    public Employee(String name, int id, double salary, String department){
        this.name = name;
        this.id= id;
        this.salary= salary;
        this.department= department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    public String toString(){
        return "ID: "+ id + "Name: "+ name+"Salary: "+salary+"Department: "+ department;
    }
}
