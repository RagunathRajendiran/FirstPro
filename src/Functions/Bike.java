package Functions;

public class Bike {
   String brand;
   int price;
   int taxAmount;
   int netPrice;
   String color;
   public int findMaximum(Bike[] a) {
	   int max=0;
	   for( Bike x:a) {
		   if(x.price>max) {
			   max=x.price;
		   }
		  }
	   return max;
   }
	   public int findMini(Bike[] a) {
		 int mini=a[0].price;  
	    for(int i=0;i<a.length;i++) {
	    	if(a[i].price<mini) {
	    		mini=a[i].price;
	    	}
	    }
		 return mini;  
	   
   }
	   public String findName(Bike[] a) {
		   int n=0;
		   String b="";
		   for(int i=0;i<a.length;i++) {
			   if(a[i].brand.length()>n) {
				   n=a[i].brand.length();
				   b=a[i].brand;
				   
			   }
		   }
		   return b;
	   }
}
