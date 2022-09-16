package LoopObjectArrayCondition;

public class UsePen {
	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.brand="Cello";
		pen1.price=10;
		pen1.color="black";
		pen1.isBalpens=true;
		
		Pen pen2=new Pen();
		pen2.brand="Rorito";
		pen2.price=20;
		pen2.color="blue";
		pen2.isBalpens=true;
		
		Pen pen3=new Pen();
		pen3.brand="Renalds";
		pen3.price=10;
		pen3.color="Red";
		pen3.isBalpens=true;
		
		
		Pen[] pens= {pen1,pen2,pen3};
		int min=pens[0].price;
		String b="";
		for(Pen p:pens) {
			System.out.println("Brand :"+p.brand+" ,"+"Price :"+p.price+" ,"+"Color :"+ p.color+" ,"+"IsBalpens :"+p.isBalpens);
		}
		for(Pen q:pens) {
			if(q.price<=min) {
				min=q.price;
				b=q.brand;
			}
		}
		System.out.println("Minimum :"+min+" "+b);
		
	}
}
