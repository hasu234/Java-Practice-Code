package basicClass;

public class Student {
    private String name,id,email,department;
    private char section;
    private double marks;
    
    public Student(){} //default constructor
    public Student(String n, String i, String e, String d) // overloaded construtor. constructor for intialization
    {
           this.name=n; this.id=i; this.email=e; this.department=d;
           this.marks=0.0;
    }
    public void updateName(String n)
    {  this.name=n;}
    public String getId()
    {
       return this.id;
    }
    public String getDepartment(){
          return this.department;
    }
    public void setMarks(double mark){
       this.marks=mark;
    }
    public void display()
    {
        System.out.println("Name: "+this.name+" Id: "+this.id+" Department: "+this.department+" Email: "+this.email);
    }
    public double getMarks()
    { return this.marks;
    }
    
}
