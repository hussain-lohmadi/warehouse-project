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
        
    }

    public Product(String n, String t ,int ID ,double p) {
        this.name = n;
        this.id = ID;
        this.price = p;
        this.type = t;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getID(){
        return id;
    }
     
    public double calculateDim (double h, double w, double l){
        hight = h;
        width = w;
        length = l;
       this.productDimsion = this.hight * this.width * this.length;



        return this.productDimsion;
    }

    public double getPrice(){
        return price;
    }
    public double convertToSar(){
        this.priceInRiyals = 3.75 * this.getPrice();
        return this.priceInRiyals;
        
    }

    
    public void printProdInfo (){
        System.out.println("Name : "+ name );
        System.out.println("ID : "+ id );
        System.out.println("Type : "+ type );
        System.out.println("Price : "+ price + "$" );
        System.out.println("Price in riyal : " + this.convertToSar());

    }


    

} 
