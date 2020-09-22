/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july3.pkg2017;

/**
 *
 * @author Administrator
 */
public class Faculty extends Employee{
    private double officeHour;
    private String rank;
    public Faculty(String n,String a, String p, String e, double ofc, String r)
    {
        super(n,a,p,e,"XYZ",35000);
        this.officeHour=ofc;
        this.rank=r;
    }
    public String toString(){
       return getClass().getName()+" "+this.name;
    }
}
