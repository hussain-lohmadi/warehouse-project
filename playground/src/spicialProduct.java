import java.util.Scanner;
public class spicialProduct extends Product {
    private String spicialDitales;
    private String name; 
    public spicialProduct (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is spicial about this prduct : " );
        this.spicialDitales = scanner.nextLine();
        scanner.close();
    }
    @Override
    public void printProdInfo(){
        System.out.println("Name : "+ getName() );
        System.out.println("The spicial feature : "+ spicialDitales);
    }
    
}