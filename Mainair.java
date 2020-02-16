
public class Mainair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane air = new Airplane(100, 3, 900, "ferrari", "usa", "mitsubishi");
		System.out.println(air.getEngineKind());
		System.out.println(air.toString());
		Chopper chop = new Chopper();
		System.out.println(chop.getFeatures());
		System.out.println(chop.getGas());

	}

}
