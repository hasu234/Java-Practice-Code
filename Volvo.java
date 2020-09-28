
public class Volvo extends Vehicles implements Drive {
	private double price;
	

	public Volvo(String m, double price) {
		super(m);
		this.price = price;
	}


	public static void main(String[] args) {
		Volvo v=new Volvo("Great", 12000.00);
		v.display();
		System.out.println("Price: "+v.price);
		v.startEngine();
		v.stopEngine();
		

	}


	@Override
	public void startEngine() {
		System.out.println("Engine Started! ");
		
	}


	@Override
	public void stopEngine() {
		System.out.println("Engine Stopped!");
		
	}

}
