/*wear house project 
 * studeints name :
 * Al hussain Lohmadi (leadr) 
 * Saud Fallatah
 * Zyad Al otaibi
 * Ali Aqeel
 * Murad Al otaibi
 * Hamdan Al Zahrani
 */

/*project description */
/*we aim our goal to creat a program that can help the user mange his warehouse
 for example if you have a warehouse taht is used to store milk 
 our program will help you mange your warehouse in 5 diffreint ways
 1- customers (people that are storing products in your warehouse )
 2- emnployees (people that are working in your warehouse)
 3- reciving and eports (is to right forms about how many products (in bulks) have came and left thw warehouse)
 4- ptoducts and spicial products (to write a form about single product and spicial product/like gold/)
 5- Stoking (is to check how much the warehouse make and how much it lose)



 Stocking has methods to calculate the loss and gains
 some methods are shared between classes that are not connected but do the same funcation 
 */



 
import java.util.Scanner;

import javax.sound.midi.SysexMessage;


import java.util.ArrayList;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args)  {
        System.out.println("1- customers (people that are storing products in your warehouse)");
        System.out.println("2- emnployees (people that are working in your warehouse)");
        System.out.println("3- reciving and eports (is to right forms about how many products (in bulks) have came and left thw warehouse)");
        System.out.println("4- ptoducts and spicial products (to write a form about single product and spicial product/like gold/)");
        System.out.println("5- Stoking (is to check how much the warehouse make and how much it lose)");
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2993 = new Scanner(System.in);
        
       
        ArrayList<Customer> customerSarray =  new ArrayList<Customer>();
        ArrayList<Desktopworker> EmpArray = new ArrayList<Desktopworker>();
        ArrayList<Fieldworker> fworkerarray = new ArrayList<Fieldworker>();
        ArrayList<reciving> recivingarray = new ArrayList<reciving>();
        ArrayList<exports> exportsarray = new ArrayList<exports>();
        ArrayList<Product> productarray = new ArrayList<Product>();
        ArrayList<spicialProduct> SpicalProductarray = new ArrayList<spicialProduct>();
        ArrayList<Stocking> stokingArray =  new ArrayList<Stocking>();
        
        //these variables are for moving freely in the menu
        boolean Continue = true;
        int trans ;
        String trans1000 ;
        int salary = 0;
        String title = "null";
        int trans4;
        int trans5;
        int trans8;
        int dnum = 0;
        boolean kontinue = true;
        String krans;
        double spisalprice = 0;
        String sicalname = null;
        boolean lontinu = true;
        boolean  numOfExt2 = true;
        String krans1 ;
        boolean numOfExt3 = true; 
        boolean montinu = true; 
        String kran555 ;
        String kran477;
        Scanner snr511 = new Scanner(System.in);

       /*this loop is for the menu*/
       while( Continue == true ){
        System.out.println("Type the number of service you wants : ");
        System.out.println("1- Customer ");
        System.out.println("2- Employees ");
        System.out.println("3- Reciving and Exports ");
        System.out.println("4- Products and Spicial products ");
        System.out.println("5- Stocking ");
        int numOfService = scnr.nextInt();
        switch(numOfService){
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
            case 1:{
           while(kontinue == true ){
           Scanner snrrrr = new Scanner (System.in);
           System.out.println("what serves do you want:");
           System.out.println("1- add new customer");
           System.out.println("2- view customers list");
           Scanner scnr3 = new Scanner(System.in);
           trans = scnr3.nextInt();
        if(trans == 1){ //this loop is for choosing what serves in customers
             System.out.println("How many customers do you want? ");
            int counter = scnr.nextInt();                                           
                
                for(int i =0; i < counter ; i++){ //this loop is for adding new customers
                    Scanner scnr1 = new Scanner(System.in);
                    
                    //double total;
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
             else if (trans == 2){ //this loop is for choosing what serves in customers
                     for (Customer ct : customerSarray) { //this loop for printing
                        System.out.println("Customer name: " + ct.getName() + ", Product/batch serial number: "
                                + ct.getProductSN() + ", Time of renting (per day): " + ct.getTimeOfrent()
                               + ", space of renting for every (4*4*4 cm): " + ct.getSpaceOfRent() + ", the net time = " + ct.calctimeOfRent(ct.getTimeOfrent())+ ", the net space = " +ct.calcspaceOfRent(ct.getSpaceOfRent())+", the total is: "+ct.clactotal(ct.calcspaceOfRent(ct.getSpaceOfRent()),ct.calctimeOfRent(ct.getTimeOfrent()),5 )) ;
                               

                           }


            
                  }
                  System.out.println("Do you want other services in the customers section(answer in yes or no)");
                     krans= snrrrr.nextLine();
                     if (krans.equals("yes")){
                        kontinue = true;
                     }
                     else if(krans.equals("no")){
                        kontinue = false;
                     }

           }
               

            }
            break;

        
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
            case 2:{
                while (lontinu == true){
                System.out.println("Please enter the number of service 1- Desktop worker , 2- Field worker ");
            int numOfExt4 =scnr.nextInt();
            switch(numOfExt4){
                   
                case 1:{
                    System.out.println("what serves do you want:");
                    System.out.println("1- add new worker");
                    System.out.println("2- view workers list");
                    Scanner scnr5 = new Scanner(System.in);
                    trans4=scnr5.nextInt();
                    if(trans4 == 1){ //this loop is for choosing what serves in Employees
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
                        Scanner scnnr = new Scanner(System.in);
                        int position = uscnr.nextInt();
                        switch(position){
                            case 1:
                            System.out.println("Enter the salary");
                                salary = scnnr.nextInt();
                                 title = "presidant";
                                break;
                            case 2:
                            System.out.println("Enter the salary");
                            salary = scnnr.nextInt();
                                title = "vice presidant";
                                break;
                            case 3:
                            System.out.println("Enter the salary");
                            salary = scnnr.nextInt();
                                title = "secretary";
                                break;
                            case 4:
                            System.out.println("Enter the salary");
                            salary = scnnr.nextInt();
                                title = "IT";
                                break;
                            case 5:
                            System.out.println("Enter the salary");
                            salary = scnnr.nextInt();
                                title = "HR";
                                break;
                             }

                       
                        Desktopworker DW = new Desktopworker(wname, workshift, ID);
                          EmpArray.add(DW);

                    }
                }
                    else if (trans4 == 2)
                    { for (Desktopworker DW : EmpArray) {
                        System.out.println("emloye name: " + DW.getName() + ", Work Shift: "
                                + DW.getWorkShift() + ",  ID: " + DW.getID()
                               + ", salary: " + DW.calcSalary(DW.getWorkShift(),salary) + " title: " + title);
                           }
                        }

                 break;
            }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
            case 2:
            {System.out.println("what serves do you want:");
            System.out.println("1- add new worker");
            System.out.println("2- view workers list");
            Scanner scnr9 = new Scanner(System.in);
            trans4=scnr9.nextInt();
            if(trans4 == 1){
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
                Scanner scnrr = new Scanner(System.in);
                int position = jscnr.nextInt();
                switch(position){
                    case 1:
                    System.out.println("Enter the salary");
                    salary = scnrr.nextInt();
                         title = "Distributor";
                        break;
                    case 2:
                    System.out.println("Enter the salary");
                    salary = scnrr.nextInt();
                        title = "Supervisor";
                        break;
                    case 3:
                    System.out.println("Enter the salary");
                    salary = scnrr.nextInt();
                        title = "Crain driver";
                        break;
                    case 4:
                    System.out.println("Enter the salary");
                    salary = scnrr.nextInt();
                        title = "Product counter";
                        break;
                    case 5:
                    System.out.println("Enter the salary");
                    salary = scnrr.nextInt();
                        title = "Security";
                        break;
                     }

               
                Fieldworker FW = new Fieldworker(wname, workshift, ID);
                  fworkerarray.add(FW);

            }


            }
            else if (trans4 == 2)
            { for (Fieldworker FW : fworkerarray) {
                System.out.println("employee name: " + FW.getName() + ", Work Shift: "
                        + FW.getWorkShift() + ",  ID: " + FW.getID()
                       + ", salary: " + FW.calcSalary(FW.getWorkShift(),salary) + " title: " + title);
                   }
                }

         break;
            
        }

    } Scanner scnr889 = new Scanner(System.in);
    System.out.println("Do you want other services in the Employees section(answer in yes or no)");
      krans1= scnr889.nextLine();
      if (krans1.equals("yes")){
       lontinu = true;
        }
      else if(krans1.equals("no")){
       lontinu = false;
        }
}break;
}           
       
            
             
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
            case 3:{
                while(numOfExt2 == true){
                System.out.println("Please enter the number of service 1- Reciving , 2- Exports");
                Scanner scnr69 = new Scanner(System.in);
                int numOfExt6 = scnr69.nextInt();
                switch(numOfExt6){//this loop is for choosing what serves in Reciving/Exports
                    case 1:{
                        Scanner scnr10 = new Scanner(System.in);
                        System.out.println("Please choose your service: ");
                        System.out.println("1- Add new batch");
                        System.out.println("2- view batches info");
                    
                        trans5 = scnr10.nextInt();
                        if(trans5 == 1){
                            System.out.println("how many batches do you want ?");
                            int bcounter = scnr10.nextInt();
                            for(int m=0 ; m < bcounter; m++){
                                Scanner scnra = new Scanner(System.in);
                                Scanner scnrb = new Scanner(System.in);
                                Scanner scnrc = new Scanner(System.in);
                                Scanner scnru = new Scanner(System.in);


                                System.out.println("Enter the batch name "+(m+1)+": ");
                                String bname = scnra.nextLine();
                                System.out.println("Enter batch type "+(m+1)+": ");
                                String bType = scnra.nextLine();
                                System.out.println("Enter batch serial number "+(m+1)+": ");
                                int bNum = scnrb.nextInt();
                                dnum = bNum;
                                System.out.println("batch weight "+(m+1)+": ");
                                double bWeight = scnrc.nextDouble();
                                System.out.println("Enter batch hight, length and width (respectively) "+(m+1)+": ");
                                double bHight =scnrc.nextDouble();
                                double bLength =scnrc.nextDouble();
                                double bWidth =scnrc.nextDouble();
                                System.out.println("Batch price "+(m+1)+": ");
                                double bprofet = scnrc.nextDouble();
                                System.out.println("enter the batch description");
                                String bbatchdescription = scnru.nextLine();
                                reciving rec1 = new reciving(bname, bType, bNum, bWeight,bHight,bLength,bWidth, bprofet,bbatchdescription);
                                recivingarray.add(rec1);
                                rec1.printInfo();
                                
                            }
                        }else if(trans5 == 2){
                            for(reciving rec1:recivingarray){
                                System.out.println("Batch name: "+rec1.getName()+", Batch type: "+rec1.getType()+", Batch serial number: "+rec1.getNum()+", Batch weight: "+rec1.getweight()+", Batch dimnsion: "+rec1.calculateDim(rec1.gethight(),rec1.getlength(),rec1.getwedth()));
                                System.out.println("Batch price including fees: "+ rec1.calcproft(rec1.getprofet(),rec1.gethight(),rec1.getlength(),rec1.getwedth()));
                                System.out.println("batch description: " + rec1.getbatchDiscription());


                            }
                        }
            break; } 
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
                case 2:{
                    Scanner scnr20 = new Scanner(System.in);
                    Scanner scnr21 = new Scanner(System.in);
                        System.out.println("Please choose your service: ");
                        System.out.println("1- fill new export report form");
                        System.out.println("2- view batches info");
                        trans8 = scnr20.nextInt();

                        if(trans8 == 1){
                            System.out.println("how many form do you want to fill? ");
                            int ccounter = scnr21.nextInt();
                            for(int r=0 ; r < ccounter; r++){
                                Scanner scnruqu = new Scanner(System.in);
                                Scanner scnruqu1 = new Scanner(System.in);
                                Scanner scnruqu2 = new Scanner(System.in);
                                System.out.println("type the batch number");
                                int cBnum = scnruqu.nextInt();
                                System.out.println("type the batch leaving time");
                                int ctimeOfLeaving = scnruqu1.nextInt();
                                System.out.println("type the batch shiping cost");
                                double cshipingcost = scnruqu2.nextDouble();
                                exports expo = new exports(ctimeOfLeaving, cshipingcost, cBnum);
                                exportsarray.add(expo);
                                expo.printInfo();
                                expo.compares(dnum);
                                
                            }
                        }else if(trans8 == 2){
                            for(exports expo:exportsarray){
                                System.out.println("Batch number: "+expo.getbatchNumber());
                                System.out.println("Batch time of leaving: "+ expo.gettimeOfarrive());
                                System.out.println("batch description: " + expo.getshipingCost());


                            }
                        }break; 
                    } 
                }

            break;

            }
            Scanner scnrExt = new Scanner(System.in);
            String krans3; 
            System.out.println("Do you want other services in the Reciving/Exports section(answer in yes or no)");
            krans3= scnrExt.nextLine();
              if (krans3.equals("yes")){
                numOfExt2 = true;
                }
              else if(krans3.equals("no")){
                numOfExt2 = false;
                }break;
        
        } 
            
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
            case 4:{//this loop is for choosing what serves in Products/Special Products
            while(numOfExt3 == true){
            System.out.println("Please enter the number of service 1- Products , 2- Spicial Products");
            Scanner scnr66 = new Scanner(System.in);
            int numOfExt7 = scnr66.nextInt();
            switch(numOfExt7){
                case 1:{
                    Scanner scnr77 = new Scanner(System.in);
                    System.out.println("Please choose your service: ");
                    System.out.println("1- Add new product");
                    System.out.println("2- View products");

                    int trans9 = scnr77.nextInt();                  
                    if(trans9 == 1){
                        System.out.println("How many product do you want to add ");
                        int pcounter = scnr77.nextInt();
                        for(int p = 0 ; p < pcounter ; p++){
                            Scanner scnr11 = new Scanner(System.in);
                            Scanner scnr22 = new Scanner(System.in);
                            Scanner scnr33 = new Scanner(System.in);

                            System.out.print("Enter product name "+(p+1)+": ");
                            String pname = scnr11.nextLine();
                            System.out.println("Enter the product type "+(p+1)+": ");
                            String ptype = scnr11.nextLine();
                            System.out.println("Enter product ID "+(p+1)+": ");
                            int pID = scnr22.nextInt();
                            System.out.println("Enter product price "+(p+1)+": ");
                            double pprice = scnr33.nextDouble();
                            System.out.println("Enter product hight, width and length(respectively) "+(p+1)+": ");
                            double pheight = scnr33.nextDouble();
                            double pwidth = scnr33.nextDouble();
                            double plength = scnr33.nextDouble();


                            Product pr1 = new Product(pname, ptype, pID, pprice, pheight, pwidth, plength);
                            productarray.add(pr1);
                            pr1.printProdInfo();
                            
                        }
                    }else if(trans9 == 2){
                        for(Product pr1:productarray){
                            System.out.println("Product name: "+ pr1.getName());
                            System.out.println("Product type: "+ pr1.getType());
                            System.out.println("Product ID: "+ pr1.getID());
                            System.out.println("Product price: "+ pr1.getPrice()+"$, in riyals: "+pr1.convertToSar()+"SAR");
                            System.out.println("Product dimnsion: "+ pr1.calculateDim(pr1.getheight(), pr1.getwidth(), pr1.getlength()));

                        }
                        
                    }

                }
                 break;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
                case 2:{
                    System.out.println("Please choose your service: ");
                    System.out.println("1- Add new special product");
                    System.out.println("2- View special products list");
                    Scanner scnr78 = new Scanner(System.in);
                    int trans10 = scnr78.nextInt();
                    if (trans10 == 1){
                        System.out.println("How many product do you want to add");
                        int ounter = scnr78.nextInt();
                        for(int o = 0 ; o < ounter ; o++){
                        Scanner scnruqu3 = new Scanner(System.in);
                        Scanner scnruqu6 = new Scanner(System.in);
                        Scanner scnruqu5 = new Scanner(System.in);
                        Scanner scnruqu8 = new Scanner(System.in);
                        System.out.print("Enterthe spical product name "+(o+1)+": ");
                        String oname = scnruqu3.nextLine();
                        System.out.println("Enter the product type "+(o+1)+": ");
                        System.out.println("1- exotic car");
                        System.out.println("2- high end pc");
                        System.out.println("3- jewlary");
                        System.out.println("4- gold");
                        System.out.println("5- statue");
                        Scanner sscnr = new Scanner(System.in);
                        int otype = scnruqu6.nextInt();
                        switch (otype){
                            case 1:
                            System.out.println("Set a price: ");
                            sicalname = "exotic car";
                            spisalprice = sscnr.nextInt();
                            break;
                            case 2:
                            System.out.println("Set a price: ");
                            sicalname = "high end pc parts";
                            spisalprice = sscnr.nextInt();
                            break;
                            case 3:
                            System.out.println("Set a price: ");
                            sicalname = "jewlary";
                            spisalprice = sscnr.nextInt();
                            break;
                            case 4:
                            System.out.println("Set a price: ");
                            sicalname = "gold";
                            spisalprice = sscnr.nextInt();
                            break;
                            case 5:
                            System.out.println("Set a price: ");
                            sicalname = "statue";
                            spisalprice = sscnr.nextInt();
                            break;

                        }
                        System.out.println("Enter the spical product ID "+(o+1)+": ");
                        int oID = scnruqu5.nextInt();
                        
                        System.out.println("Enter spicial product hight, width and length(respectively) "+(o+1)+": ");
                            double pheight = scnruqu8.nextDouble();
                            double pwidth = scnruqu8.nextDouble();
                            double plength = scnruqu8.nextDouble();
                            spicialProduct sp1 = new spicialProduct(oname, oID, pheight, pwidth, plength);
                        SpicalProductarray.add(sp1);
                        sp1.printspicialProdInfo();
                    }
                
                }else if (trans10 == 2){
                   for(spicialProduct sp1 : SpicalProductarray){
                    System.out.println("Special product name: "+ sp1.getName());
                    System.out.println("Special product ID: "+ sp1.getID());
                    System.out.println("Special product type: "+sicalname );
                    System.out.println("Special product price: "+spisalprice);
                    System.out.println("Special product dimnsion: "+sp1.calculateDim(sp1.getheight(), sp1.getwidth(), sp1.getlength()));
 
                   }

                }
                break; }
            }
            Scanner scnrExt377 = new Scanner(System.in);
           
            System.out.println("Do you want other services in the Products section(answer in yes or no)");
            kran477= scnrExt377.nextLine();
              if (kran477.equals("yes")){
                numOfExt3 = true;
                }
              else if(kran477.equals("no")){
                numOfExt3 = false;
                }  } break;
        
                        }             
                
            
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    case 5:{
        while(montinu == true){//this loop is for choosing what serves in Stocking
        try {
            System.out.println("Please choose your service: ");
            System.out.println("1- Add new report");
            System.out.println("2- View Stocking list");
            Scanner scnr79 = new Scanner(System.in);
            int trans10 = scnr79.nextInt();
            if (trans10 == 1) {
                System.out.println("How many reports do you want to add");
                int scounter = scnr79.nextInt();
                for (int s = 0; s < scounter; s++) {
                    Scanner sccnr = new Scanner(System.in);
                    Scanner sccnr1 = new Scanner(System.in);
                    Scanner sccnr2 = new Scanner(System.in);
                    System.out.println("Enter your gain: ");
                    double gain = sccnr1.nextDouble();
                    System.out.println("Enter the field salary: ");
                    double fieldSalary = sccnr.nextDouble();
                    System.out.println("Enter the electronic bill: ");
                    double electronicBill = sccnr1.nextDouble();
                    System.out.println("Enter the water bill: ");
                    double waterBill = sccnr.nextDouble();
                    System.out.println("Enter the landlord rent: ");
                    double landlordRent = sccnr2.nextDouble();
                    System.out.println("Enter the office salary: ");
                    double officeSalary = sccnr.nextDouble();
                    System.out.println("Enter the bank loan: ");
                    double bankLoan = sccnr1.nextDouble();
                    Stocking stk1 = new Stocking(fieldSalary, electronicBill, waterBill, landlordRent, officeSalary, bankLoan, gain);
                    stokingArray.add(stk1);
                    
                }
                
            }else if(trans10 == 2){
                for (Stocking stk1 : stokingArray) {
                    System.out.println("The Total loss is: " + stk1.calcTotalLoss(stk1.getfeildsalary(), stk1.getelectronicbill(), stk1.getwaterbill(), stk1.getlandlordrent(), stk1.getofficesalary(), stk1.getbankloan()));
                    System.out.println("The total gains is: " + (stk1.getGain() - stk1.calcTotalLoss(stk1.getfeildsalary(), stk1.getelectronicbill(), stk1.getwaterbill(), stk1.getlandlordrent(), stk1.getofficesalary(), stk1.getbankloan())));
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Do you want other services in the stoking section(answer in yes or no)");
        kran555= snr511.nextLine();
          if (kran555.equals("yes")){
            montinu = true;
            }
          else if(kran555.equals("no")){
            montinu = false;
            } 
        }break;
        
    }
         

}System.out.println("Continue ? (answer in yes or no)");
trans1000 = scnr2993.nextLine();
if(trans1000.equals("yes")){
   Continue = true;
}else if (trans1000.equals("no")){
   Continue = false;
}
// the end of menu loop

}
}}


    


