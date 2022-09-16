package LmsTest;

public class UseCar {
    public static void main(String[] args) {
		String[] a=args[0].split(",");
		Car car1=new Car();
		car1.brand=a[0];
		car1.price=Integer.parseInt(a[1]);
		car1.isAirBag=Boolean.parseBoolean(a[2]);
		car1.color=a[3];
		String[] b=args[1].split(",");
		Car car2=new Car();
		car2.brand=b[0];
		car2.price=Integer.parseInt(b[1]);
		car2.isAirBag=Boolean.parseBoolean(b[2]);
		car2.color=b[3];
		//System.out.println("Brand ="+car1.brand+", Price ="+car1.price+",Color ="+car1.color);
	//	System.out.println("Brand ="+car2.brand+", Price ="+car2.price+",Color ="+car2.color);
		System.out.println("Brand = "+car1.brand+","+car2.brand);
		System.out.println("Price = "+car1.price+","+car2.price);
		System.out.println("Color = "+car1.color+","+car2.color);
		
		
	}
	

}
