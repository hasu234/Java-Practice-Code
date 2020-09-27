package shop1;
public class Item {
    private String id;
    private String name;
    private double price;
    public Item(String i,String n,double p){
        this.id = i;
        this.name = n;
        this.price = p;
    }
    public void display(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Id: "+id);
        System.out.println("Product Price: "+price);
    }
     public double pay(){
        return price;
    }
}
