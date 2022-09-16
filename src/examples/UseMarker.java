package examples;

public class UseMarker {
     public static void main(String[] args) {
		Marker m1=new Marker();
		m1.price=10;
		m1.color="blue";
		m1.weight=2;
		m1.isQuality=true;
		Marker m2=new Marker();
		m2.price=20;
		m2.color="black";
		m2.weight=2;
		m2.isQuality=true;
		Marker m3=new Marker();
		m3.price=20;
		m3.color="red";
		m3.weight=2;
		m3.isQuality=true;
		System.out.println("Price ="+m1.price+", Color ="+m1.color+", Weight"+m1.weight+", Is Quality ="+m1.isQuality);
		System.out.println("Price ="+m2.price+", Color ="+m2.color+", Weight"+m2.weight+", Is Quality ="+m2.isQuality);
		System.out.println("Price ="+m3.price+", Color ="+m3.color+", Weight"+m3.weight+", Is Quality ="+m3.isQuality);
		
	}
	

}
