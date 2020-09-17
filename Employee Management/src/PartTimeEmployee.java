
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursPerWeek;
    public PartTimeEmployee(String n, String i){
        super(n,i);
    }
    @Override
    public void display(){
        System.out.println(getName());
        System.out.print("Salary : ");
        System.out.println(calculateSalary());
    }
    @Override
    public double calculateSalary(){
        return this.hoursPerWeek*this.hourlyRate;
    }
    public void setHours(int a){
        this.hoursPerWeek = a;
    }
    public void setRate(double a){
        this.hourlyRate = a;
    }
}
