package LoopObjectArrayCondition;

public class SmallNumber {

	public static void main(String[] args) {
		String a="Abc";
        char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" "+b[i]+" "+b[i]);
			
		}
		
	}
}
