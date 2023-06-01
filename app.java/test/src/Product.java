import java.util.Scanner;
public class Product {
    Scanner scnr = new Scanner(System.in);
    private String name ;
    private int id ;
    private double price;
    private String type;
    private double hight;
    private double width;
    private double length;
    private double productDimsion = 0;
    private double priceInRiyals=0;


    public Product (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter product ID: ");
        this.id = scanner.nextInt();

        System.out.print("Enter product price: ");
        this.price = scanner.nextDouble();

        System.out.print("Enter product type: ");
        this.type = scanner.nextLine();

        scanner.close();
    }

    public Product(String n, int ID, double p, String t) {
        this.name = n;
        this.id = ID;
        this.price = p;
        this.type = t;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public double calculateDim (double h, double w, double l){
        hight = h;
        width = w;
        length = l;
       this.productDimsion = this.hight * this.width * this.length;
        return this.productDimsion;
    }

    public double convertToSar(double price){
        this.priceInRiyals = 3.75 * price;
        return this.priceInRiyals;
        
    }

    public void printProdInfo (){
        System.out.println(" ");
        System.out.println("Name : "+ name );
        System.out.println("ID : "+ id );
        System.out.println("Type : "+ type );
        System.out.println("Price : "+ price + "$" );
        System.out.println("Price in riyal : " + priceInRiyals);
        System.out.println("Product Diminsion : "+ productDimsion );
    }
} 

    
    
