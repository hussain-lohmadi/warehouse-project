import java.util.Scanner;

public class exports extends reciving {
    private String timeOfArrive;
    private double shipingCost;

    public exports(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the time of arrival : ");
        timeOfArrive = scnr.nextLine();
        System.out.println(" Enter the shiping cost : ");
        shipingCost = scnr.nextInt();
        scnr.close();
    }
    public String gettimeOfarrive(){
        return timeOfArrive;
    }
    public double getshipingCost(){
        return shipingCost;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("The time of arrival is : "+ this.timeOfArrive);
        System.out.println("The shiping cost is : "+ this.shipingCost);
    }

}