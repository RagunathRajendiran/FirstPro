package Collection4;

public class StringOutOf {
  public static void main(String[] args) {
	String[] f= {"mani","kopal","valli"};
	try {
		char b=f[0].charAt(5);
		System.out.println(b);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	

}
