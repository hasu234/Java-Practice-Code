package shop1;
public class Test {
    public static void main(String[] args) {
        Item a1,a2,a3;
        a1 = new Item("S12","Lux",35);
        a2 = new Item("C34","Kitkat",96);
        a3 = new Item("C35","Catbery",100);
        Customer c1,c2;
        c1 = new Customer("Sam","1625","Shykat Emam",21);
        c2 = new Customer("Harun","2563","Harun-Ar-Rashid",43);
                   
        boolean b = c1.login("Sam","1625");
        if(b==true){
            System.out.println("Log in Succesful.");
            c1.buy(a1);
            c1.buy(a3); 
            c1.display();
        }
        else System.out.println("Please enter Right User name and password");
        
        boolean c = c2.login("Harun","20563");
        if(c==true){
            System.out.println("Log in Succesful.");
            c2.buy(a3);
            c2.display();
        }
        else System.out.println("Please enter Right User name and password");
        
        
    }
}
