package Conditions;

public class UseAirConditioner {
     public static void main(String[] args) {
		AirConditioner ac1=new AirConditioner();
		ac1.brand="Samsung";
		ac1.price=450000;
		ac1.color="White";
		AirConditioner ac2=new AirConditioner();
		ac2.brand="Geoograj";
		ac2.price=5500000;
		ac2.color="Black";
		AirConditioner ac3=new AirConditioner();
		ac3.brand="TaTa";
		ac3.price=420000;
		ac3.color="Red";
		AirConditioner ac4=new AirConditioner();
		ac4.brand="Samsung";
		ac4.price=600000;
		ac4.color="Blue";
		if(ac1.price>ac2.price && ac1.price>ac3.price && ac1.price>ac4.price) {
			System.out.println(ac1.brand.toUpperCase());
		}else if(ac2.price>ac1.price && ac2.price>ac3.price && ac2.price>ac4.price) {
			System.out.println(ac2.brand.toUpperCase());
		}else if(ac3.price>ac2.price && ac3.price>ac1.price && ac3.price>ac4.price) {
			System.out.println(ac3.brand.toUpperCase());
		}else {
			System.out.println(ac4.brand.toUpperCase()); 
		}


		
	}
	

}
