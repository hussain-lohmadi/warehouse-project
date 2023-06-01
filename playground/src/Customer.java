import java.util.Scanner;
public class Customer {
    Scanner scnr = new Scanner(System.in);
    private String customerName;
    private double ProductSN ;
    private double timeOfRent;
    private double spaceOfRent;
    private static double valuOftime = 50; //per day
    private static double valuOfspace = 50; //per unit
    /*1 unit should equal to 4*4*4 */
    private double netTime;
    private double netSpace;
    public Customer(){
        System.out.print("enter the customer: ");
        this.customerName = scnr.nextLine();
        
        System.out.print("enter product/batch serial number: ");
        this.ProductSN = scnr.nextDouble();

        System.out.print("enter the time of rentitng (per day): ");
        this.timeOfRent = scnr.nextDouble();

        System.out.print("enter the space of renting for every (4*4*4 cm): ");
        this.spaceOfRent = scnr.nextDouble();
    }
    public Customer(String n,double p, double t, double s){
      this.customerName =n;
      this.ProductSN =p;
      this.timeOfRent=t;
      this.spaceOfRent =s;

    }

    public String getName(){
      return customerName;
    }
    public double getProductSN(){
      return ProductSN;
    }
    public double getTimeOfrent(){
      return timeOfRent;
    }
    public double getSpaceOfRent(){
      return spaceOfRent;
    }
      public void calctimeOfRent(){
        
         netTime = valuOftime*timeOfRent;
        System.out.print(netTime);
      }
      public void calcspaceOfRent(){
        
        netSpace = valuOfspace*spaceOfRent;
       System.out.print(netSpace);

     }

    public void clactotal(){
        double x;
        netSpace = valuOfspace*spaceOfRent;
        netTime = valuOftime*timeOfRent; 
        x = netSpace + netTime;
        System.out.println("the totel rent is =" + x);
    }
}
