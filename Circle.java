
public class Circle {
   private double radiuos;

    public Circle() {
    }

    public Circle(double rds) {
        this.radiuos = rds;
    }

    public double getRadiuos() {
        return radiuos;
    }

    public void setRadiuos(double radi) {
        this.radiuos = radi;
    }
    public double getArea(){
        double res=3.1416*radiuos*radiuos;
        return res;
    }
    public void displayArea(){
        System.out.println("Area: "+getArea());
    }
    
   
}
