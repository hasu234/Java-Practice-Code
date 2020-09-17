/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DOLPHIN
 */
public class FullTimeEmployee extends Employee{
    private double salary;
    public FullTimeEmployee(String n, String i){
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
        return this.salary;
    }
    public void setSalary(double a){
        this.salary = a;
    }
}
