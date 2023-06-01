import java.util.Scanner;

public class Employees {
    private String name;
    private double salary;
    private int workShift;

    public Employees(String name, double salary, int workShift) {
        this.name = name;
        this.salary = salary;
        this.workShift = workShift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkShift(int workShift) {
        this.workShift = workShift;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getWorkShift() {
        return this.workShift;
    }

    
}


