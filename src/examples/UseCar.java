package examples;

public class UseCar {
       public static void main(String[] args) {
		   Car car1=new Car();
		   car1. brand="BMW";
		   car1. colour="Ash";
		   car1. price=1500000;
		   car1.taxAmount=5000;
		   car1. netPrice=car1.price+car1.taxAmount;
		   car1 .isSensor=true;
		   car1. rating=4.6f;
		   car1. battryType='C';
		   System.out.println("Brand ="+car1.brand+": Colour ="+car1.colour+": Net Price ="+car1.netPrice);
		   
		   Car car2=new Car();
		   car2. brand="VW";
		   car2. colour="White";
		   car2. price=2000000;
		   car2.taxAmount=5000;
		   car2. netPrice=car2.price+car2.taxAmount;
		   car2 .isSensor=true;
		   car2. rating=4.6f;
		   car2. battryType='C';
		   System.out.println("Brand ="+car2.brand+": Colour ="+car2.colour+": Net Price ="+car2.netPrice);
		   
		   Car car3=new Car();
		   car3. brand="TATA";
		   car3. colour="Red";
		   car3. price=2500000;
		   car3.taxAmount=5000;
		   car3. netPrice=car3.price+car3.taxAmount;
		   car3 .isSensor=true;
		   car3. rating=4.6f;
		   car3. battryType='C';
		   System.out.println("Brand ="+car3.brand+": Colour ="+car3.colour+": Net Price ="+car3.netPrice);
	}

}
