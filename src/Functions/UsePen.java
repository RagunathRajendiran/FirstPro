package Functions;

public class UsePen {
	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.brand="Cello";
		pen1.price=35;
		pen1.color="blue";
		
		Pen pen2=new Pen();
		pen2.brand="Apsara";
		pen2.price=45;
		pen2.color="black";
		
		Pen pen3=new Pen();
		pen3.brand="Renolds";
		pen3.price=40;
		pen3.color="blue";
		
		System.out.println(pen1.name(pen1,pen2,pen3));
		
	}

	

}
