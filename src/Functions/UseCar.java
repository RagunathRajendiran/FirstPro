package Functions;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="TATA";
		car1.price=4500000;
		car1.color="blue";
		Car car2=new Car();
		car2.brand="Maruthi";
		car2.price=4600000;
		car2.color="Yellow";
		System.out.println(car1.findMaximumCarPrice(car1,car2));
		
	}

	}
