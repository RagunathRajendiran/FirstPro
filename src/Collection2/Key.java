package Collection2;

import java.util.HashMap;

public class Key {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(794, "Dhurga");
		lms.put(801, "Karthic");
		lms.put(812,"Pandian");
		lms.put(813, "Muthu");
		lms.put( 810,"Raj");
		for(Integer j:lms.keySet()) {
			System.out.println(j);
		}
	lms.forEach((x,y)->System.out.println(x+" "+y));
}
}
