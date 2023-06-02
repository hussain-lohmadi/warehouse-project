import java.util.Scanner;

import java.util.ArrayList;

public class reciving {
    private int batchNumber;
    private double batchwaight;
    private String batchType;
    private double batchHight;
    private double batchWaidth;
    private double batchLength;
    private double batchDim;
    private String batchName;
    private double profet;
    private String batchDiscription;
    private static int fees= 5;

    public reciving (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter batch name: ");
        this.batchName = scanner.nextLine();

        System.out.println("Enter batch type");
        this.batchType = scanner.nextLine();
        
        System.out.print("Enter batch serial number: ");
        this.batchNumber = scanner.nextInt();
        
        System.out.print("batch size: ");
        this.batchwaight = scanner.nextDouble();
        
        System.out.print("Enter batch hight, length and width (respectively): " );
        this.batchHight = scanner.nextDouble();
        this.batchLength = scanner.nextDouble();
        this.batchWaidth = scanner.nextDouble();

        System.out.print("Enter batch profet");
        this.profet = scanner.nextDouble();

        
        
    }
    public reciving (String batchName ,String batchType ,int batchNumber  ,double batchSize ,double batchHight ,double batchLength ,double batchWaidth){
     this.batchNumber = batchNumber; 
     this.batchwaight = batchSize;
     this.batchType = batchType;
     this.batchHight = batchHight;
     this.batchLength = batchLength;
     this.batchWaidth = batchWaidth;
     this.batchDim = batchDim;
     this.batchName = batchName;
     
    }

    public double getweight(){
        return this.batchwaight;
    }

    public int getNum(){
        return this.batchNumber;
    }

    public static int getFees(){
        return fees;
      } 

    public String getName(){
        return this.batchName;
    }

    public String getType(){
        return this.batchType;
    }

    public double gethight(){
        return this.batchHight;
    }
    public double getlength(){
        return this.batchLength;
    }
    public double getwedth(){
        return this.batchWaidth;
    }
    public double getprofet(){
        return this.profet;
    }
    public double calculateDim (double h, double w, double l){
        
        this.batchHight = h;
        this.batchWaidth = w;
        this.batchLength = l;
       this.batchDim = this.batchHight * this.batchWaidth * this.batchLength;

       return this.batchDim;
    } 
    public double calcproft(double x, double y ){
        x = this.profet;
        y = reciving.fees;
        double z;
        z = x+y;
        
        return z;
    }  


    public void printInfo(){
        System.out.println("batch name: " + batchName);
        System.out.println("batch serial number: " + batchNumber);
        System.out.println("batch size: " + batchwaight);
        System.out.println("batch type: " + batchType);
        System.out.println("batch daimiosion: " + batchDim);

 
    }
}

    

