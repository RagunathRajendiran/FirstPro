package LoopObjectArrayCondition;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="TATA";
		car1.price=100000;
		car1.color="Blue";
		car1.isPetrolic=true;
		car1.engineCC=180;
		
		Car car2=new Car();
		car2.brand="VW";
		car2.price=150000;
		car2.color="Black";
		car2.isPetrolic=true;
		car2.engineCC=200;
		
		Car car3=new Car();
		car3.brand="BMW";
		car3.price=200000;
		car3.color="Red";
		car3.isPetrolic=true;
		car3.engineCC=250;
		
		Car car4=new Car();
		car4.brand="Lamporkini";
		car4.price=250000;
		car4.color="Gray";
		car4.isPetrolic=true;
		car4.engineCC=300;
		
		Car[] cars=new Car[4];
		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;
		cars[3]=car4;
		
		int m=0;
		int max=0;
		int n=0;
		int len=cars[0].brand.length();
		for(int i=0;i<cars.length;i++) {
			if(cars[i].price>max) {
				max=cars[i].price;
				m=i;
			}
		}
		for(int i=0;i<cars.length;i++) {
			if(cars[i].brand.length()<len) {
				len=cars[i].brand.length();
				n=i;
				
			}
		}
		System.out.println(cars[m].brand.toUpperCase()+" "+cars[m].price+" "+cars[m].color.toUpperCase()+" "+cars[m].isPetrolic+" "+cars[m].engineCC);
		System.out.println(cars[n].brand+" "+cars[n].price+" "+cars[n].color+" "+cars[n].isPetrolic+" "+cars[n].engineCC);
	}

	
}
