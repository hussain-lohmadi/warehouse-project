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
        
        
        //these variables for case 1 
        boolean flag1 = true;
        
       
        String trans2;
        int u=0;
        boolean Continue = true;

        String trans3 ;
       
        int salary = 0;
        String title = "null";


        String trans4;


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

                             }
                       }
             else if (trans3.equals("view customers list")){
                     for (Customer ct : customerSarray) {
                        System.out.println("Customer name: " + ct.getName() + ", Product/batch serial number: "
                                + ct.getProductSN() + ", Time of renting (per day): " + ct.getTimeOfrent()
                               + ", space of renting for every (4*4*4 cm): " + ct.getSpaceOfRent());
                           }

            
                  }
               

            }
            break; 
            //--------------------------------------------------------------------------------------------------//
            case 2:
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
            
        }break;
             
            //-------------------------------------------------------------------------------------------------//
            case 3:
            System.out.println("Please enter the number of service 1- Reciving , 2- Exports");
            numOfExt = scnr.nextInt();
            switch(numOfExt){
                case 1: break;
                case 2: break;
            }
            break;
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

