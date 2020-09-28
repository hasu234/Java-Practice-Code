

package basicInterface;


public abstract class Vehicle {
    protected String model;
    protected double weight;
    public Vehicle(){}
    public Vehicle(String m,double w){
        this.model=m;
        this.weight=w;
    }
    public abstract void display();
}
