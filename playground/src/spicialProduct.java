
import java.util.Scanner;
public class spicialProduct extends Product {
    private String spicialDitales;

    public spicialProduct (){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is spicial about this prduct : " );
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
