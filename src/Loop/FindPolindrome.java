package Loop;

public class FindPolindrome {
   public static void main(String[] args) {
	String a="LEvEL";
	String b="";
	for(int i=a.length()-1;i>=0;i-- ) {
		b=b+a.charAt(i);
	}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("It is Polindrome");
		}else {
			System.out.println("It is NOTPolindrom");
		}
	}

}


