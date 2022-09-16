package examples;

public class UseAirConditioner {
     public static void main(String[] args) {
		AirConditioner ac1=new AirConditioner();
		ac1.brand="SamSung";
		ac1.price=40000;
		ac1.noOfWings=4;
		ac1.isQuality=true;
		AirConditioner ac2=new AirConditioner();
		ac2.brand="Tata";
		ac2.price=45000;
		ac2.noOfWings=4;
		ac2.isQuality=true;
		System.out.println("BRAND ="+ac1.brand.toUpperCase()+", Price ="+ac1.price+
				", No Of Wings ="+ac1.noOfWings+", Is Quality ="+ac1.isQuality);
		System.out.println("BRAND ="+ac2.brand.toUpperCase()+", Price ="+ac2.price+
				", No Of Wings ="+ac2.noOfWings+", Is Quality ="+ac2.isQuality);

	}

}
