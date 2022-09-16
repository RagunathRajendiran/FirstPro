package examples;



public class UsePen {

        public static void main(String[] args) {
			Pen pen1=new Pen();
			pen1.color="Blue";
			pen1.brand="Hero";
			pen1.isQuality=true;
			pen1.isInkPen=true;
			pen1.price=10;
			System.out.println("COLOR ="+pen1.color+", BRAND = "+pen1.brand+",IS QUALITY = "+pen1.isQuality
					+", IS INK PEN = "+pen1.isInkPen+", PRICE = "+pen1.price);
			Pen pen2=new Pen();
			pen2.color="Black";
			pen2.brand="Cello";
			pen2.isQuality=true;
			pen2.isInkPen=true;
			pen2.price=10;
			System.out.println("COLOR ="+pen2.color+", BRAND = "+pen2.brand+",IS QUALITY = "+pen2.isQuality
					+", IS INK PEN = "+pen2.isInkPen+", PRICE = "+pen2.price);
		}
}
	  


	


