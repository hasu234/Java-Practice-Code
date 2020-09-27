package shop1;
import java.util.ArrayList;
public class Customer extends User{
    private String name;
    private int age;
    private int totalBought=0;
    private double totalPayment=0;
    private ArrayList<Item> item = new ArrayList();
    private Address adr;
    public void setAddress(Address a){
        this.adr = a;
    }
    public Address getAddress(){
        return this.adr;
    }
    public Customer(String u,String p,String n,int a){
        super(u,p);
        this.age = a;
        this.name = n;
    }
    public void buy(Item i){
        item.add(i);
        totalPayment = totalPayment + i.pay();
        totalBought++;
    }
    public void display(){
        System.out.println(name);
        System.out.println("You bought: ");
        System.out.println(totalBought+" Items");
        for(Item i: item){
            i.display();
        }
        System.out.println("You need to pay: "+totalPayment);
    }
}
