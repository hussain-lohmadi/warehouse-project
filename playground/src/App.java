import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args)  {
        Scanner scnr = new Scanner(System.in);
        int numOfExt;
        int numOfExt2;
        String trans = "yes";
        ArrayList<Customer> customerSarray =  new ArrayList<Customer>();
        
        //these variables for case 1 
        boolean flag1 = true;
        System.out.println("kk");
        
       
        String trans2;
        int u=0;
        boolean Continue = true;


       while( Continue == true ){
        System.out.println("Type the number of service you wants : ");
        System.out.println("1- Customer ");
        System.out.println("2- Employees ");
        System.out.println("3- Reciving and Exports ");
        System.out.println("4- Products and Spicial products ");
        System.out.println("5- Stocking ");
        int numOfService = scnr.nextInt();
        switch(numOfService){
            case 1: System.out.println("How many customers do you want? ");
            int counter = scnr.nextInt();                                            // this case is for Customer service
                for(int i =0; i < counter ; i++){
                    Scanner scnr1 = new Scanner(System.in);
                    
                   
                    System.out.println("Please enter the customer name " + (i+1)+": ");
                    String nameName = scnr1.nextLine();
                    System.out.println("Enter product/batch serial number " + (i+1)+": ");
                    double ProductSN = scnr.nextDouble();
                    System.out.println("Enter the time of rentitng (per day)" + (i+1)+": ");
                    double timeOfRent = scnr.nextDouble();
                    System.out.println("Enter the space of renting for every (4*4*4 cm)" + (i+1)+": ");
                    double spaceOfRent = scnr.nextDouble();
                    Customer ct1 = new Customer(nameName, ProductSN, timeOfRent, spaceOfRent);
                    customerSarray.add(ct1);
                    
                    /*System.out.println("do you want to create customer ?");
                    trans2=scnr1.nextLine();
                    if(trans2.equals("yes")){
                        i =0;
                    }else {
                        
                      i = 6;
                      flag1 = false;
                    }*/
               

            }
            break; 
            case 2: break;
            case 3:
            System.out.println("Please enter the number of service 1- Reciving , 2- Exports");
            numOfExt = scnr.nextInt();
            switch(numOfExt){
                case 1: break;
                case 2: break;
            }
            break;
            case 4:
            System.out.println("Please enter the number of service 1- Products , 2- Spicial Products");
            numOfExt2 = scnr.nextInt();
            switch(numOfExt2){
                case 1: break;
                case 2: break;
            }
            break;
            case 5: break;
        }
        Scanner scnr2 = new Scanner(System.in);
        System.out.println("Continue ? (answer in yes or no)");
        trans = scnr2.nextLine();
        if(trans.equals("yes")){
            Continue = true;
        }else if (trans.equals("no")){
            Continue = false;
        }

        
       }
       
    }
}
