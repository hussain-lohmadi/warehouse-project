import java.util.Scanner;
public class Customer {
    Scanner scnr = new Scanner(System.in);
    private String customerName;
    private int ProductSN ;
    private double timeOfRent;
    private double spaceOfRent;
    private static double valuOftime = 50; //per day
    private static double valuOfspace = 50; //per unit
    private static int fees = 5;

    /*1 unit should equal to 4*4*4 */
    private double netTime;
    private double netSpace;
    public Customer(){
        System.out.print("enter the customer: ");
        this.customerName = scnr.nextLine();
        
        System.out.print("enter product/batch serial number: ");
        this.ProductSN = scnr.nextInt();

        System.out.print("enter the time of rentitng (per day): ");
        this.timeOfRent = scnr.nextDouble();

        System.out.print("enter the space of renting for every (4*4*4 cm): ");
        this.spaceOfRent = scnr.nextDouble();
    }
    public Customer(String n,int p, double t, double s){
      this.customerName =n;
      this.ProductSN =p;
      this.timeOfRent=t;
      this.spaceOfRent =s;

    }

    public static int getFees(){
      return fees;
    } 

    public String getName(){
      return customerName;
    }
    public int getProductSN(){
      return ProductSN;
    }
    public double getTimeOfrent(){
      return timeOfRent;
    }
    public double getSpaceOfRent(){
      return spaceOfRent;
    }
      public double calctimeOfRent(double n){
        
         netTime = this.valuOftime*this.timeOfRent;
         n = netTime ;
        return n;
      }
      public double calcspaceOfRent(double p){
        
        netSpace = this.valuOfspace*this.spaceOfRent;
        p = netSpace;
    
       return p;

     }

    public double clactotal(double x, double y, int r ){
       double z;
        //netSpace = this.valuOfspace*this.spaceOfRent;
        //netTime = this.valuOftime*this.timeOfRent; 
        x = this.netSpace;
        y = this.netTime;
        r = this.fees;
        double total = x+y+r;
        z = total;

        
        return z;
    }
}
