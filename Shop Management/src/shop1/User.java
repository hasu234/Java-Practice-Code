package shop1;
public class User {
    private String id;
    private String password;
    public User(String i, String p){
        this.password = p;
        this.id = i;
    }
    public boolean login(String i,String p){
        if(i.equals(id) && p.equals(password)){
            return true;
        }
        else return false;
    }
}
