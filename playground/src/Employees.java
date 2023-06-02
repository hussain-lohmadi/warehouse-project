import java.util.Scanner;

public class Employees{
    private String name;
    //private double salary;
    private int workShift;
    private int ID;
    private int position;
    private String title; 

    public Employees (){
        
    }

    public Employees(String name , /*double salary*/ int workShift, int ID /*String title*/) {
        this.name = name;
        this.ID = ID;
        //this.title = title;
        //this.salary = salary;
        this.workShift = workShift;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public void setSalary(double salary) {
        this.salary = salary;
    }*/

    public void setWorkShift(int workShift) {
        this.workShift = workShift;
    }
    public void setposition(int position) {
        this.position = position;
    }

    public void settitle(String title){
        this.title = title;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    /*public double getSalary() {
        return this.salary;
    }*/

    public int getWorkShift() {
        return this.workShift;
    }
    public int getID() {
        return this.ID;
    }
    public int getposition() {
        return this.position;
    }
    public String gettitle() {
        return this.title;
    }
    
    public void Raise(double amount, int salary) {
        salary += amount;
    } 

    public void promote(String newTitle, int salary) {
        salary *= 1.1; 
    }

    public double calcSalary(int n, int salary){
        this.workShift = n;
        salary = workShift * 50;
       
        return salary;

    }


        
    
    }