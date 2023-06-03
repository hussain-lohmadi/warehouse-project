import java.util.Scanner;
public class Stocking {
/*this class should show the wearhouse value and how much it cost to run it */
    private double gain;
    private double lose;
    private double networth;
    private double feildsalary;
    private double electronicBill;
    private double waterBill;
    private double landLordRent;
    private double officeSalary;
    private double rentIncome;
    private double bankLoan;

    public Stocking(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the total gains : ");
        this.gain = scnr.nextDouble();
        System.out.println("Enter the feild salary : ");
        this.feildsalary = scnr.nextDouble();
        System.out.println("Enter the electronic bill : ");
        this.electronicBill = scnr.nextDouble();
        System.out.println("Enter the water bill : ");
        this.waterBill = scnr.nextDouble();
        System.out.println("Enter the land lord rent : ");
        this.landLordRent = scnr.nextDouble();
        System.out.println("Enter the office salary : ");
        this.officeSalary = scnr.nextDouble();
        System.out.println("Enter the bank loan : ");
        this.bankLoan = scnr.nextDouble();

        scnr.close();
    }

    public double getGain(){
        return gain;
    }

    public double getLose(){
        return lose;
    }

    public double getfeildsalary(){
        return feildsalary;
    }

    public double getelectronicbill(){
        return electronicBill;
    }

    public double getwaterbill(){
        return waterBill;
    }

    public double getlandlordrent(){
        return landLordRent;
    }

    public double getofficesalary(){
        return officeSalary;
    }

    public double getbankloan(){
        return bankLoan;
    }

    public Stocking(double g, double l){
        this.gain = g;
        this.lose = l;
    }

    public double calcRentincome(double g, double l ){
        this.gain = g;
        this.lose = l;
        this.networth = this.gain + this.lose;
        return networth;
    }

    public void PrintStockingDetails(){
        System.out.println("Total gains : "+ gain);
        System.out.println("Total loses : "+ lose);
        System.out.println("Networth : "+networth);

    }
    // this method will calculate every detal in the wearhouse 
    public double calcRentincome(double FS, double EB, double WB, double LR, double OS, double BL){
        this.feildsalary = FS;
        this.electronicBill = EB;
        this.waterBill = WB;
        this.landLordRent = LR;
        this.officeSalary = OS;
        this.bankLoan = BL;
        this.lose = this.feildsalary + this.electronicBill + this.waterBill + this.landLordRent + this.officeSalary + this.bankLoan;
        this.rentIncome = this.lose;
        return rentIncome; 
    }
    // method to output the total
    public void ifmeathod(){
        if (this.rentIncome > 0){
            System.out.println("The total gain is : +"+networth);
        }
        else{System.out.println("The total loss is : -"+networth);

        }
    }
}