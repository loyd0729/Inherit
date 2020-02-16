
public class Toratora extends Airplane {
	
	private String propeller;
	
	public Toratora() {
		super();
		this.propeller = "side";
		
	}
	
	public Toratora(String propeller, int size, int numOfWheels, int gas, String engineKind, String made, String manufacturer) {
		super();
		this.propeller = propeller;
		
	}
	
	public void propeller(String propeller) {
		this.propeller = propeller;
		
	}
	
	public String propeller() {
		return propeller;
		
	}
	

}

