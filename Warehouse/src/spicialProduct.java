
import java.util.Scanner;
public class spicialProduct extends Product {
    
    private String spicalname ;
    private int spicalId ;
    private double spicalPrice;
    private int spicalType;
    private double specialHight;
    private double specialWidth;
    private double specialLength;
    private String spicialDitales;

    public spicialProduct(String n, int t ,int ID ,double p) {
        this.spicalname = n;
        this.spicalId = ID;
        this.spicalPrice = p;
        this.spicalType = t;
    }


    public spicialProduct (){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is spicial about this prduct: " );
        this.spicialDitales = scanner.nextLine();
        scanner.close();
    }

    public spicialProduct (String s){
        spicialDitales = s;

    }
    public String getspicialDitails(){
        return spicialDitales;
    }
    @Override
    public void printProdInfo(){
       super.printProdInfo();
        System.out.println("The spicial feature : "+ spicialDitales);
    }
    
}
