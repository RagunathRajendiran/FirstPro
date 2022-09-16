package Collection1;

import java.util.ArrayList;

public class Student1 {
   public static void main(String[] args) {
	ArrayList<Integer>stdId=new ArrayList<>();
	stdId.add(101);
	stdId.add(101);
	stdId.add(103);
	stdId.add(104);
	stdId.add(105);
	stdId.set(1,100);
	stdId.remove(0);
	for(int i=0;i<stdId.size();i++) {
		System.out.println(stdId.get(i));
	}
	for(Integer s:stdId) {
		System.out.println("**"+s);
	}
	for(int i=stdId.size()-1;i>=0;i--) {
		System.out.println("***"+stdId.get(i));
	}
}
	

}
