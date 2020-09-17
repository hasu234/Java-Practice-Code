/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasmot Ali Hasu
 */
public class Test {
    public static void main(String[] args) {
        PartTimeEmployee m = new PartTimeEmployee("Mehedi","172-188");
        FullTimeEmployee n = new FullTimeEmployee("Melon","15");
        Address m1 = new Address(15,255,"Mirpur 10");
        Address n1 = new Address(10,25898,"Shyamoli");
        m.setHours(5);
        m.setRate(100);
        m.display();
        m1.display();
        n.setSalary(23000);
        n.display();
        n1.display();
    }
}
