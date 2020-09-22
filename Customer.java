package customer;
public class Customer {
     private String id;
     private String name;
     private String address;
     
     public Customer(){}
     public Customer(String i, String n, String a)
     {
           this.id=i;this.name=n;this.address=a;
     }
     public void display(){
        System.out.println("Name:  "+name+"\n"+"Id: "+id+"\n"+"Address: "+address);
     }
    public static void main(String[] args) {
        Customer c1,c2;
        c1=new Customer("121-15-10","Ahmed","Dhanmondi");
        c2=new Customer("121-15-11","Bobi","Mirpur");
        
        c1.display();
        c2.display();
    }
    
}
