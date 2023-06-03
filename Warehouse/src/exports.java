import java.util.Scanner;

public class exports /*extends reciving*/ {
    private int timeOfLEAVE;
    private double shipingCost;
    private int batchNumber;
    public exports(int tol, double esc, int bn){
        this.timeOfLEAVE = tol;
        this.shipingCost = esc;
        this.batchNumber = bn;
    }
    public int gettimeOfarrive(){
        return timeOfLEAVE;
    }
    public double getshipingCost(){
        return shipingCost;
    }
    public int getbatchNumber(){
        return this.batchNumber;
    }
    public void printInfo(){
        System.out.println("The batch number: " + this.batchNumber);
        System.out.println("The time of leaving is : "+ this.timeOfLEAVE);
        System.out.println("The shiping cost is : "+ this.shipingCost);
    }

}