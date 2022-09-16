package Oops1;

public class UseLaptop {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.setBrand("indel");
		b.setPrice(1000);
		b.setIsChargedType(true);
		
		Laptop lap=new Laptop();
		lap.setBrand("Dell");
		lap.setPrice(45000);
		lap.setProcessor("intelCoreI11");
		lap.setRam(8);
		lap.setColor("Blue");
		lap.setBattery(b);
		
		System.out.println(lap.getBrand()+" "+lap.getPrice()+" "+lap.getProcessor()+" "+
		lap.getRam()+" "+lap.getColor()+" "+lap.getBattery().getBrand());
	}


}
