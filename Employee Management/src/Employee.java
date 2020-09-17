/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DOLPHIN
 */
public abstract class Employee {
    private String name;
    private String id;
    protected Employee(){
        
    }
    protected Employee(String n, String i){
        this.id = i;
        this.name = n;
    }
    public void setid(String i){
        this.id = i;
    }
    public String getName(){
        return this.name;
    }
    public abstract double calculateSalary();
    public abstract void display();
}
