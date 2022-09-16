package Functions;

public class Maximum {
 public int max() {
	 int[] a= {1,2,3,4,5};
	 int b=a[0];
	 for(int i=0;i<a.length;i++) {
		 if(a[i]>b) {
			 b=a[i];
		 }
	 }
	 return b;
 }
 public static void main(String[] args) {
	Maximum m=new Maximum();
	System.out.println("Maximum:"+m.max());
}	
}
