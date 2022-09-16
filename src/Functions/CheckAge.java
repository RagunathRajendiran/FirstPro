package Functions;

public class CheckAge {
   public String retairmentAge(int age) {
	   if(age>60) {
		   return "Eligible to RetaireMent";
	   }
	   else {
		   return "Not Eligble";
	   }
	   
   }
	public static void main(String[] args) {
		CheckAge m=new CheckAge();
		System.out.println(m.retairmentAge(56));
		System.out.println(m.retairmentAge(61));
	}

}
