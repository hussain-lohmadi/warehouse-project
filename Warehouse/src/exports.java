import java.util.Scanner;

public class exports extends reciving {
    private int timeOfLEAVE;
    private double shipingCost;
    private int batchNumber;
    

    public exports(){
        Scanner sss = new Scanner(System.in);
        System.out.println("Edsda");
        timeOfLEAVE=sss.nextInt();
        System.out.println("dsds");
        shipingCost=sss.nextDouble();
        System.out.println("sasasda");
        batchNumber=sss.nextInt();
    }
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

    /*public boolean equal (exports ex2){
        if ((this.batchNumber == ex2.batchNumber)){
            System.out.println("There is an error (the two batch numbers are the same)");
            return true;
        }else{
            System.out.println("There are no errors");
            return false;
        }


    }*/

    public void compares (int x ){
        if(x == this.getbatchNumber()){
            System.out.println("numbers are correct");
        }else{
            System.out.println("numbers are not correct");
        }

    }


    public void printInfo(){
        System.out.println("The batch number: " + this.batchNumber);
        System.out.println("The time of leaving is : "+ this.timeOfLEAVE);
        System.out.println("The shiping cost is : "+ this.shipingCost);
    }

}