
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasmot Ali Hasu
 */
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
