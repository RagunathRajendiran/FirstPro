package Functions;

public class Name {
 public String names() {
	 String[] a= {"Ragunath","Raju","Rajendiran"};
	 int b=a[0].length();
	 String c="";
	 for(int i=0;i<a.length;i++) {
		 if(a[i].length()>b) {
			 b=a[i].length();
			 c=a[i];
		 }
	 }
	 return c;
	 
	 
 }
 public static void main(String[] args) {
	Name n=new Name();
	System.out.println(n.names());
}
}
