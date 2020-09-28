
import java.util.Scanner;


public class User {
    static Scanner sc=new Scanner(System.in);
    String username;
    String password;
    public User(String us, String pass){
        this.username=us;
        this.password=pass;
    }


    public void Looogin(){
        String user,user1, pass,pass1;
        System.out.println("Enter Username: ");
        user=sc.nextLine();
        System.out.println("Enter Password:  ");
        pass=sc.nextLine();
        if(username.equals(user)&&password.equals(pass))
        {
            System.out.println("Log In Success!");
        }
        else
        {
            System.out.println("Did Not Match! Try Again! ");
            System.out.println("Enter Username: ");
            user1=sc.nextLine();
            System.out.println("Enter Password:  ");
            pass1=sc.nextLine();
        }
        
        
        
    }
    
}
