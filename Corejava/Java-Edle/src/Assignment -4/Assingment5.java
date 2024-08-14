package Assignment3;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    private double overtimeHours;
    private double overtimeRate;

    public Programmer(String name, double baseSalary, double overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    
    public double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}

public class Assingment5 {
    public static void main(String[] args) {
        Employee employee = new Employee("abinav chandar", 3000);
        System.out.println(employee.name + "Salary:" + employee.calculateSalary());

        Manager manager = new Manager("praveen kumar", 5000, 1500);
        System.out.println(manager.name + "Salary:" + manager.calculateSalary());

        Programmer programmer = new Programmer("yuvaraj", 4000, 10, 50);
        System.out.println(programmer.name + "Salary:" + programmer.calculateSalary());
    }
}