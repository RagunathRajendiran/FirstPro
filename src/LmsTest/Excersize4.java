package LmsTest;

public class Excersize4 {
      public static void main(String[] args) {
    	String[] value=args[0].split(",");
		String a=value[0];
		int b=Integer.parseInt(value[1]);
		boolean c=Boolean.parseBoolean(value[2]);
		String d=value[3];
		long e=Long.parseLong(value[4]);
		System.out.println("Name :"+a);
		System.out.println("Roll No :"+b);
		System.out.println("Is Present :"+c);
		System.out.println("Mail Id :"+d);
		System.out.println("Mobile No :"+e);
		
				
	}
	

}
