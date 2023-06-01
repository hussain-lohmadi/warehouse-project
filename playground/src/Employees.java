import java.util.Scanner;

public class Employees {
    private String name;
    private double salary;
    private int workShift;
    private int ID;
    private String position;

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
    public int getID() {
        return this.ID;
    }
    
    public void giveRaise(double amount) {
        this.salary += amount;
    } 

    public void promote(String newTitle) {
        this.salary *= 1.1; 
    }

    public double calcSalary(int n){
        this.workShift = n;
        salary = workShift * 50;
       
        return salary;

    }

    
        public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter employee work shift: ");
        int workShift = scanner.nextInt();

        Employees employee = new Employees(name, salary, workShift);

        System.out.print("Enter Employee Postion: " );
        String position = scanner.nextLine();

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Employee work shift: " + employee.getWorkShift());

        

        scanner.close();
    }

        private String getposition() {
            return null;
        }
    
    }