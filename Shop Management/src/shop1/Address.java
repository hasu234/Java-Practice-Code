package shop1;
public class Address {
    private int road;
    private String city;
    private String district;
    public Address(int r,String c,String d){
        this.road = r;
        this.district = d;
        this.city = c;
        
    }
    public void display(){
        System.out.println("Your address:");
        System.out.println(road+","+district+","+city+".");
    }
    
}
