/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july3.pkg2017;


public class Staff extends Employee{
    private String title;
    public Staff(String n,String a, String p, String e,String t)
    {
        super(n,a,p,e,"XYZ",35000);
        this.title=t;
    }
    public String toString(){
       return getClass().getName()+" "+this.name;
    }
}