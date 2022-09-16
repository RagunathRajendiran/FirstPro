package examples;

public class UseShirt {
      public static void main(String[] args) {
		Shirt s1=new Shirt();
		s1. brand="Otto";
		s1.color="Blue";
		s1. price=1000;
		s1. discountAmount=300;
		s1. netPrice=s1.price-s1.discountAmount;
		s1. isChecked=true;
		System.out.println("BRAND="+s1.brand+"; COLOR="+s1.color+"; NetPrice="+s1.netPrice+"; Is Checked="+s1.isChecked);
		
		Shirt s2=new Shirt();
		s2. brand="Rayan";
		s2.color="Black";
		s2. price=700;
		s2. discountAmount=300;
		s2. netPrice=s2.price-s2.discountAmount;
		s2. isChecked=false;
		System.out.println("BRAND="+s2.brand+"; COLOR="+s2.color+"; NetPrice="+s2.netPrice+"; Is Checked="+s2.isChecked);
	}
	

}
