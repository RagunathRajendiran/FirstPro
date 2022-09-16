package Functions;

public class UseBike {
  public static void main(String[] args) {
	Bike b1=new Bike();
	b1.brand="Honda";
	b1.price=450000;
	b1.color="Black";
	Bike b2=new Bike();
	b2.brand="TVS";
	b2.price=350000;
	b2.color="Blue";
	Bike b3=new Bike();
	b3.brand="Yamaga";
	b3.price=500000;
	b3.color="Red";
	Bike b4=new Bike();
	b4.brand="Appachi";
	b4.price=550000;
	b4.color="White";
	Bike[] bikes= {b1,b2,b3,b4};
	System.out.println("Maximum: "+b1.findMaximum(bikes));
	System.out.println("Minimum: "+b1.findMini(bikes));
	System.out.println("Max Length: "+b1.findName(bikes));
	
}
	

}
