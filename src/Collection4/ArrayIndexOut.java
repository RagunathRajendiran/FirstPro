package Collection4;

public class ArrayIndexOut {
	public static void main(String[] args) {
		
	
   int[] h= {14,23,78,67};
   try {
	   int b=h[4];
	   System.out.println(b);
   }
   catch(Exception e) {
	   e.printStackTrace();
   }
	
   }
}
