package LoopIndexArrayCondition;

public class IntArrayExample {
   public static void main(String[] args) {
	   int[] array= {24,65,87,90,9,18};
	   for(int i=0;i<array.length;i++) {
		   if(array[i]%2==0 && array[i]%3==0) {
			   System.out.println(array[i]);
		   
		   }
	   }
}
	
}
