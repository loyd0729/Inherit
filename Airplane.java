

public class Airplane {
	private int size;
	private int numberOfWheels;
	private int gas;
	private String engineKind;
	private String made;
	private String manufacturer;
	
	public Airplane() {
		size = 100;
		numberOfWheels = 3;
		gas = 900;
		engineKind = "ferrari";
		made = "usa";
		manufacturer = "mitsubishi";
		
	}
	
	public Airplane(int size, int numberOfWheels, int gas, String engineKind, String made, String manufacturer) {
		this.size = size;
		this.numberOfWheels = numberOfWheels;
		this.gas = gas;
		this.engineKind = engineKind;
		this.made = made;
		this.manufacturer = manufacturer;
		
	}
	
	public void setSize(int size) {
		this.size = size;
		
	}
	
	public int getSize() {
		return size;
		
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
		
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
		
	}
	
	public void setGas(int gas) {
		this.gas = gas;
		
	}
	
	public int getGas() {
		return gas;
		
	}
	
	public void setEngineKind(String engineKind) {
		this.engineKind = engineKind;
		
	}
	
	public String getEngineKind() {
		return engineKind;
		
	}
	
	public void setMade(String made) {
		this.made = made;
		
	}
	
	public String getMade() {
		return made;
		
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		
	}
	
	public String getManufacturer() {
		return manufacturer;
		
	}

	@Override
	public String toString() {
		return "Airplane [size=" + size + ", numberOfWheels=" + numberOfWheels + ", gas=" + gas + ", engineKind="
				+ engineKind + ", made=" + made + ", manufacturer=" + manufacturer + "]";
	}
	
	}


