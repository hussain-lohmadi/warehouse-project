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
    private double bankLoan;

    public Stocking(){
       
    }
    public Stocking(double fe, double el, double wa, double la, double of, double ba, double g){
        this.feildsalary = fe;
        this.electronicBill=el;
        this.waterBill=wa;
        this.landLordRent=la;
        this.officeSalary=of;
        this.bankLoan=ba;
        this.gain=g;
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


    

    public double calcTotalLoss(double fe, double el, double wa, double la, double of,double ba){
        this.feildsalary = fe;
        this.electronicBill=el;
        this.waterBill=wa;
        this.landLordRent=la;
        this.officeSalary=of;
        this.bankLoan=ba;
        double loss =feildsalary+electronicBill+waterBill+landLordRent+officeSalary+bankLoan;
        return loss;
    }

    public void PrintStockingDetails(){
        System.out.println("Total gains : "+ gain);
        System.out.println("Total loses : "+ lose);
        System.out.println("Networth : "+networth);

    }
    
    // method to output the total
    public void ifmeathod(){
        if (this.gain > 0){
            System.out.println("The total gain is : +"+networth);
        }
        else{System.out.println("The total loss is : -"+networth);

        }
    }
}