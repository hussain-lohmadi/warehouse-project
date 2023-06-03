
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

    public spicialProduct(String n, int t, double h, double w, double l) {
        this.spicalname = n;
        this.spicalId = t;
        this.specialHight =h;
        this.specialWidth = w;
        this.specialLength =l;
       
    }
    public spicialProduct (){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is spicial about this prduct: " );
        this.spicialDitales = scanner.nextLine();
        scanner.close();
    }

    public String getName(){
        return spicalname;
    }

    public int getID(){
        return spicalId;
    }

    public double getspecialheight(){
        return specialHight;
    }

    public double getspecialwidth(){
        return specialWidth;
    }

    public double getspeciallength(){
        return specialLength;
    }


    public spicialProduct (String s){
        spicialDitales = s;

    }
    public String getspicialDitails(){
        return spicialDitales;
    }
    
    public void printspicialProdInfo(){
        System.out.println("Name : "+ this.spicalname );
        System.out.println("ID : "+ this.spicalId );
        System.out.println("Dimnsion: "+ this.calculateDim(this.getspecialheight(), this.getspecialwidth(), this.getspeciallength()));
    }
    
}
