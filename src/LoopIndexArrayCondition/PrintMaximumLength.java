package LoopIndexArrayCondition;

public class PrintMaximumLength {
      public static void main(String[] args) {
           String[] fruits= {"mango","sappotta","Banana","Apple"};
           String a="";
           String b=fruits[0];
         //  int len=0;
           for(int i=0;i<fruits.length;i++) {
        	   if(fruits[i].length()>a.length()) {
        		 //  len=fruits[i].length();
        		   a=fruits[i];
        	   }
           }
           System.out.println(a);
           for(int i=0;i<fruits.length;i++) {
        	   if(fruits[i].length()<b.length()) {
        		   b=fruits[i];
        	   }
           }
           System.out.println(b);
}
	

}
