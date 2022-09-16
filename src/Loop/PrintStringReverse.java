package Loop;

public class PrintStringReverse {
     public static void main(String[] args) {
		String name="Ashika";
		String v=" ";
		for(int i=name.length()-1;i>=0;i--) {
	          v=(v)+name.charAt(i);
	          System.out.print(v);
		}
		//System.out.println(v);
	}
	

}
