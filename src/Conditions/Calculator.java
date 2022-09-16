package Conditions;

public class Calculator {
   public static void main(String[] args) {
	int num1=10;
	int num2=5;
	String cal="divition";
	switch(cal) {
	case "addition":
		System.out.println(num1+num2);
	break;
	case "subtraction":
		System.out.println(num1-num2);
    break;
	case "multiplication":
		System.out.println(num1*num2);
    break;
	case "divition":
		System.out.println(num1/num2);
    break;
	case "modulus":
		System.out.println(num1%num2);
    break;
    default:
    	System.out.println("invalit");
    break;
          }
   }
}

	

