package basicClass;

public class TestClass {
    public static void main(String args[])
    {
           Student s1,s2;
           s1=new Student("AAAAA","11111","aaaa@cse","CSE");
           s2=new Student("BBBBB","2222","bbbb@eee","EEE");
           
           s1.display();
           s2.display();
           s1.setMarks(45);
           s2.setMarks(75);
           double d=s1.getMarks();
           double d1=s2.getMarks();
           if(d>=40)
               System.out.println(s1.getId()+ "Passed");
            if(d1>=40)
               System.out.println(s2.getId()+ "Passed");
           
    }
}
