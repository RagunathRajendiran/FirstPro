package LmsTest;

public class UseFridge {
	  public static void main(String[] args) {
		String[]a=args[0].split("@");
		Fridge fridge1=new Fridge();
		fridge1.brand=a[0].toUpperCase();
	    fridge1. price=Integer.parseInt(a[1]);
	    fridge1. color=a[2];
	    fridge1. taxAmount=Integer.parseInt(a[3]);
	    fridge1. netPrice=fridge1.price+fridge1.taxAmount;
	    String[] b=args[1].split("@");
	    Fridge fridge2=new Fridge();
	    fridge2. brand=b[0].toUpperCase();
	    fridge2. price=Integer.parseInt(b[1]);
	    fridge2. color=b[2];
	    fridge2. taxAmount=Integer.parseInt(b[3]);
	    fridge2.netPrice=fridge2.price+fridge2.taxAmount;
	    System.out.println("Brand = "+fridge1.brand+","+fridge2.brand+" "+"Color = "+fridge1.color+","+fridge2.color
	    		+" "+"NetPrice = "+fridge1.netPrice+","+fridge2.netPrice);
	  //  System.out.println("Color = "+fridge1.color+","+fridge2.color);
	  //  System.out.println("NetPrice = "+fridge1.netPrice+","+fridge2.netPrice);
	}

	}
