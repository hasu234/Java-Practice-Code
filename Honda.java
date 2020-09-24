

package basicInterface;
 
public class Honda extends Vehicle implements Drive,Race{
    
    private int noWheel;
    private double price;
    
    public Honda(String m,double w,int n,double p){
        super(m,w);
        this.noWheel=n;
        this.price=p;
    }
    
    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Model:"+super.model);
        System.out.println("Weight: "+super.weight);
         System.out.println("no of of wheel:"+this.noWheel);
          System.out.println("Price of Car: "+this.price);
    }

    @Override
    public void drive() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Now i am ready to drive!");
    }

    @Override
    public void stop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.out.println("now car is stop! Acca bye");
    }

    @Override
    public void turn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Left trun");
    }

    @Override
    public void startRace() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Now race is Start!");
    }

    @Override
    public void stopRace() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Race is stop!");
    }
    
    public static void main(String args[]){
        Honda h= new Honda("FZ",150.25,2,200000.25);
        h.display();
        h.drive();
        h.startRace();
        h.stopRace();
        h.stop();
    }
    
}
