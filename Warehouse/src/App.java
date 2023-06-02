import java.util.Scanner;

import org.w3c.dom.css.Counter;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
public class App {
    public static void main(String[] args)  {
        Scanner scnr = new Scanner(System.in);
        
        int numOfExt;
        int numOfExt2;
        String trans = "yes";
        ArrayList<Customer> customerSarray =  new ArrayList<Customer>();
        ArrayList<Desktopworker> EmpArray = new ArrayList<Desktopworker>();
        ArrayList<Fieldworker> fworkerarray = new ArrayList<Fieldworker>();
        ArrayList<reciving> recivingarray = new ArrayList<reciving>();
        
        
        //these variables for case 1 
        boolean flag1 = true;
        
       
        String trans2;
        int u=0;
        boolean Continue = true;

        String trans3 ;
       
        int salary = 0;
        String title = "null";

        int salary2= 0;
        String title2 = "null";


        String trans4;
        String trans5;


       while( Continue == true )/*this loop is for the menu*/{
        System.out.println("Type the number of service you wants : ");
        System.out.println("1- Customer ");
        System.out.println("2- Employees ");
        System.out.println("3- Reciving and Exports ");
        System.out.println("4- Products and Spicial products ");
        System.out.println("5- Stocking ");
        int numOfService = scnr.nextInt();
        switch(numOfService){
        //-------------------------------------------------------------------------------------------------//
            case 1:{
           System.out.println("what serves do you want:");
           System.out.println("add new customer");
           System.out.println("view customers list");
           Scanner scnr3 = new Scanner(System.in);
           trans3 = scnr3.nextLine();
        if(trans3.equals("add new customer")){ //this loop is for choosing what serves in customers
             System.out.println("How many customers do you want? ");
            int counter = scnr.nextInt();                                           
                
                for(int i =0; i < counter ; i++){ //this loop is for adding new customers
                    Scanner scnr1 = new Scanner(System.in);
                    
                    double total;
                    System.out.println("Please enter the customer name " + (i+1)+": ");
                    String nameName = scnr1.nextLine();
                    System.out.println("Enter product/batch serial number " + (i+1)+": ");
                    int ProductSN = scnr.nextInt();
                    System.out.println("Enter the time of rentitng (per day)" + (i+1)+": ");
                    double timeOfRent = scnr.nextDouble();
                    System.out.println("Enter the space of renting for every (4*4*4 cm)" + (i+1)+": ");
                    double spaceOfRent = scnr.nextDouble();
                    Customer ct1 = new Customer(nameName, ProductSN, timeOfRent, spaceOfRent);
                    customerSarray.add(ct1);

                             }
                       }
             else if (trans3.equals("view customers list")){
                     for (Customer ct : customerSarray) {
                        System.out.println("Customer name: " + ct.getName() + ", Product/batch serial number: "
                                + ct.getProductSN() + ", Time of renting (per day): " + ct.getTimeOfrent()
                               + ", space of renting for every (4*4*4 cm): " + ct.getSpaceOfRent() + ", the net time = " + ct.calctimeOfRent(ct.getTimeOfrent())+ ", the net space = " +ct.calcspaceOfRent(ct.getSpaceOfRent())+", the total is: "+ct.clactotal(ct.calcspaceOfRent(ct.getSpaceOfRent()),ct.calctimeOfRent(ct.getTimeOfrent()),5 )) ;
                               

                           }


            
                  }
               

            }
            break; 
            //--------------------------------------------------------------------------------------------------//
            case 2:{
                System.out.println("Please enter the number of service 1- Desktop worker , 2- Field worker ");
            int numOfExt4 =scnr.nextInt();
            switch(numOfExt4){
                   
                case 1:{
                    System.out.println("what serves do you want:");
                    System.out.println("add new worker");
                    System.out.println("view workers list");
                    Scanner scnr5 = new Scanner(System.in);
                    trans4=scnr5.nextLine();
                    if(trans4.equals("add new worker")){
                        System.out.println("How many desktop workers do you have");
                    int ecounter = scnr.nextInt();
                   
                    for(int w=0; w < ecounter ; w++){ 
                        Scanner iscnr = new Scanner(System.in);
                        Scanner tscnr = new Scanner(System.in);
                        Scanner yscnr = new Scanner(System.in);
                        Scanner uscnr = new Scanner(System.in);

                        System.out.println("Please enter the worker name " + (w+1)+": ");
                        String wname = tscnr.nextLine();
                        System.out.println("enter the worker ID");
                        int ID = iscnr.nextInt();
                        System.out.println("Enter your work shift " + (w+1)+": ");
                        int workshift = yscnr.nextInt();
                        System.out.println("Enter your posistion: " + (w+1)+": ");
                        System.out.println("1- presidant");
                        System.out.println("2- vice presidant");
                        System.out.println("3- secretary");
                        System.out.println("4- IT");
                        System.out.println("5- HR");
                        int position = uscnr.nextInt();
                        switch(position){
                            case 1:
                                salary = 10000;
                                 title = "presidant";
                                break;
                            case 2:
                                salary = 7600;
                                title = "vice presidant";
                                break;
                            case 3:
                                salary = 5000;
                                title = "secretary";
                                break;
                            case 4:
                                salary = 6700;
                                title = "IT";
                                break;
                            case 5:
                                salary = 1000;
                                title = "HR";
                                break;
                             }

                       
                        Desktopworker DW = new Desktopworker(wname, workshift, ID);
                          EmpArray.add(DW);

                    }
                }
                    else if (trans4.equals("view workers list"))
                    { for (Desktopworker DW : EmpArray) {
                        System.out.println("emloye name: " + DW.getName() + ", Work Shift: "
                                + DW.getWorkShift() + ",  ID: " + DW.getID()
                               + ", salary: " + DW.calcSalary(DW.getWorkShift(),salary) + " title: " + title);
                           }
                        }

                 break;
            }
            case 2:
            {System.out.println("what serves do you want:");
            System.out.println("add new worker");
            System.out.println("view workers list");
            Scanner scnr9 = new Scanner(System.in);
            trans4=scnr9.nextLine();
            if(trans4.equals("add new worker")){
                System.out.println("How many desktop workers do you have");
            int fcounter = scnr.nextInt();
           
            for(int k=0; k < fcounter ; k++){ 
                Scanner sscnr = new Scanner(System.in);
                Scanner jscnr = new Scanner(System.in);
                Scanner mscnr = new Scanner(System.in);
                Scanner nscnr = new Scanner(System.in);

                System.out.println("Please enter the worker name " + (k+1)+": ");
                String wname = sscnr.nextLine();
                System.out.println("enter the worker ID");
                int ID = jscnr.nextInt();
                System.out.println("Enter your work shift " + (k+1)+": ");
                int workshift = jscnr.nextInt();
                System.out.println("Enter your posistion: " + (k+1)+": ");
                System.out.println("1- Distributor");
                System.out.println("2- Supervisor");
                System.out.println("3- Crain driver");
                System.out.println("4- Product counter");
                System.out.println("5- Security");
                int position = jscnr.nextInt();
                switch(position){
                    case 1:
                        salary = 5000;
                         title = "Distributor";
                        break;
                    case 2:
                        salary = 8000;
                        title = "Supervisor";
                        break;
                    case 3:
                        salary = 5000;
                        title = "Crain driver";
                        break;
                    case 4:
                        salary = 3700;
                        title = "Product counter";
                        break;
                    case 5:
                        salary = 1500;
                        title = "Security";
                        break;
                     }

               
                Fieldworker FW = new Fieldworker(wname, workshift, ID);
                  fworkerarray.add(FW);

            }


            }
            else if (trans4.equals("view workers list"))
            { for (Fieldworker FW : fworkerarray) {
                System.out.println("emloye name: " + FW.getName() + ", Work Shift: "
                        + FW.getWorkShift() + ",  ID: " + FW.getID()
                       + ", salary: " + FW.calcSalary(FW.getWorkShift(),salary) + " title: " + title);
                   }
                }

         break;
            
        }

    }
}
            
             
            //-------------------------------------------------------------------------------------------------//
            case 3:{
                System.out.println("Please enter the number of service 1- Reciving , 2- Exports");
                Scanner scnr69 = new Scanner(System.in);
                int numOfExt6 = scnr69.nextInt();
                switch(numOfExt6){
                    case 1:{
                        Scanner scnr10 = new Scanner(System.in);
                        System.out.println("Please choose your service: ");
                        System.out.println("1- Add new batch.");
                        System.out.println("view batches info");
                    
                        trans5 = scnr10.nextLine();
                        if(trans5.equals("Add new batch")){
                            System.out.println("how many batches do you want ?");
                            int bcounter = scnr10.nextInt();
                            for(int m=0 ; m < bcounter; m++){
                                Scanner scnra = new Scanner(System.in);
                                Scanner scnrb = new Scanner(System.in);
                                Scanner scnrc = new Scanner(System.in);


                                System.out.println("Enter the batch name "+(m+1)+": ");
                                String bname = scnra.nextLine();
                                System.out.println("Enter batch type "+(m+1)+": ");
                                String bType = scnra.nextLine();
                                System.out.println("Enter batch serial number "+(m+1)+": ");
                                int bNum = scnrb.nextInt();
                                System.out.println("batch weight "+(m+1)+": ");
                                double bWeight = scnrc.nextDouble();
                                System.out.println("Enter batch hight, length and width (respectively) "+(m+1)+": ");
                                double bHight =scnrc.nextDouble();
                                double bLength =scnrc.nextDouble();
                                double bWidth =scnrc.nextDouble();
                                System.out.println("Batch price "+(m+1)+": ");
                                double bPrice = scnrc.nextDouble();
                                reciving rec1 = new reciving(bname, bType, bNum, bWeight,bHight,bLength,bWidth);
                                recivingarray.add(rec1);
                                
                            }
                        }else if(trans5.equals("view batches info")){
                            for(reciving rec1:recivingarray){
                                System.out.println("Batch name: "+rec1.getName()+", Batch type: "+rec1.getType()+", Batch serial number: "+rec1.getNum()+", Batch weight: "+rec1.getweight()+", Batch dimnsion: "+rec1.calculateDim(rec1.gethight(),rec1.getlength(),rec1.getwedth()));
                                System.out.println("Batch price including fees: "+  rec1.calcproft(rec1.getprofet(), reciving.getFees()));


                            }


                        }



                } break;
                case 2: break;
            }

            break;

            }
            
            //-------------------------------------------------------------------------------------------------//
            case 4:
            System.out.println("Please enter the number of service 1- Products , 2- Spicial Products");
            numOfExt2 = scnr.nextInt();
            switch(numOfExt2){
                case 1: break;
                case 2: break;
            }
            break;
            //-------------------------------------------------------------------------------------------------//
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

        
       }// the end of menu loop
       
    }
    }


