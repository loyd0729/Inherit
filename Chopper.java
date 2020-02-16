

public class Chopper extends Airplane {
	
	private String features;
	
	public Chopper() {
		super();
		this.features = "elesi";
	
	}
	
	public Chopper(String features, int size, int numOfWheels, int gas, String engineKind, String made, String manufacturer) {
		super();
		this.features = features;
		
	}
	
	public void setFeatures(String features) {
		this.features = features;
		
	}
	
	public String getFeatures() {
		return features;
		
	}

}