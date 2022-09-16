package Functions;

public class Calculators {
	public String addition(int a,int b) {
		return "Addition: "+(a+b);
		
	}
	public String subtraction(int a,int b) {
		return "Subtraction: "+(a-b);
	}

	public static void main(String[] args) {
		Calculators cal=new Calculators();
		System.out.println(cal.addition(15,20));
		System.out.println(cal.subtraction(20,10));
	}

}
