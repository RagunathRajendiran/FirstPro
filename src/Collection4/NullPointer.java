package Collection4;

public class NullPointer {
  public static void main(String[] args) {
	try {
		String a=null;
		int b=a.length();
		System.out.println(b);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
}
