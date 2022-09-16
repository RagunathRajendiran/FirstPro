package LoopObjectArrayCondition;

public class UseLaptop {
   public static void main(String[] args) {
	Laptop lap1=new Laptop();
	lap1.brand="lenovo";
	lap1.price=15000;
	lap1.color="Black";
	lap1.ram=4;
	lap1.isQuality=true;
	
	Laptop lap2=new Laptop();
	lap2.brand="Apple";
	lap2.price=180000;
	lap2.color="White";
	lap2.ram=16;
	lap2.isQuality=true;
	
	Laptop lap3=new Laptop();
	lap3.brand="Acer";
	lap3.price=25000;
	lap3.color="Red";
	lap3.ram=8;
	lap3.isQuality=true;
	
	Laptop[] laps= {lap1,lap2,lap3};
	int max=laps[0].price;
	String maxBrand="";
	for(int i=0;i<laps.length;i++) {
		if(laps[i].price>max) {
			max=laps[i].price;
			maxBrand=laps[i].brand;
		}
		
		System.out.println("Brand :"+laps[i].brand+", Price :"+laps[i].price+",Color :"+laps[i].color+", IsQuality :"+laps[i].isQuality);
	}
	System.out.println("Maximum price ="+max+",MaxBrand ="+maxBrand);
}

}
