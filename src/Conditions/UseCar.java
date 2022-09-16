package Conditions;

public class UseCar {
    public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="TaTa";
		car1.price=30000;
		car1.color="Blue";
		Car car2=new Car();
		car2.brand="RoYaTa";
		car2.price=35000;
		car2.color="Blue";
		if(car1.price>car2.price) {
			System.out.println(car1.brand.charAt(0));
		}else {
			System.out.println(car2.brand.charAt(0));
		}
		
	}


}
