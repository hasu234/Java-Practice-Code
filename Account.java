
package account;

import java.util.Scanner;

public class Account {
    private String name;
    private String number;
    private String type;
    private double balance;
    
    static Scanner scan=new Scanner(System.in); 

    public Account() {
    }

    public Account(String nm, String num, String tp) {
        this.name = nm;
        this.number = num;
        this.type = tp;
        this.balance = 0;
    }

    public double deposite(double a){
        this.balance=a;
        return balance;
    }
    
    public double withdrow(){
        System.out.println("Balance: "+balance);
        System.out.print("How Much Amount Do You Want To Withdrow: ");
        double wb=scan.nextDouble();
        return balance-wb;
    }
    
    public void display(){
        double g=withdrow();
        System.out.println("Name: "+name);
        System.out.println("Final Balance: "+g);
    }

    public static void main(String[] args) {
        Account ac=new Account("Hasu", "114488", "Saving");
        ac.deposite(50000);
        ac.display();
    }
    
}
