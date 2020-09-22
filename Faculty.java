
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

