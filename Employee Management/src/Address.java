
/**
 *
 * @author Hasmot Ali Hasu
 */
public class Address {
    private int houseNo;
    private int road;
    private String area;
    public Address(int h, int r,String a){
        this.area = a;
        this.houseNo = h;
        this.road = r;
    }
    public void display(){
        System.out.println("House NO: "+this.houseNo);
        System.out.println("Road : "+this.road);
        System.out.println("Area : "+this.area);
    }
}
