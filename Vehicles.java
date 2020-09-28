
public abstract class Vehicles {
	protected String model;
	public Vehicles (String m)
	{
		this.model=m;
	}
	public void display(){
		System.out.println("Model: "+model);
	}
}
