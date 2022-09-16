package Collection2;

import java.util.HashMap;

public class Values {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(794, "Dhurga");
		lms.put(801, "Karthic");
		lms.put(812,"Pandian");
		lms.put(813, "Muthu");
		lms.put( 810,"Raj");
		for(String j:lms.values()) {
			System.out.println(j);
		}
	
	}
}
