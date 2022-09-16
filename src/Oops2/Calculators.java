package Oops2;

public class Calculators {
     public int add(int a) {
    	 return a;
     }
     public int add(int b,int c) {
    	 return b+c;
     }
     public int add(int d,int e,int g) {
    	 return d+e+g;
     }
     public int add(int h,int i,int j,int k) {
    	 return h+i+j+k;
     }
     public static void main(String[] args) {
    	 Calculators v=new  Calculators();
    	 System.out.println(v.add(10));
    	 System.out.println(v.add(10,20));
    	 System.out.println(v.add(10,20,30));
    	 System.out.println(v.add(10,20,30,40));
    	 
	}
}

