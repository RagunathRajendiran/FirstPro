package Oops2;

public class Bank {
   public int loan() {
	return 50000;
   }
   public int loan(int salary) {
	   return (salary*10)+50000;
   }
   public int loan(int salary,int propertyValue) {
	   return (salary*10)+propertyValue/2+50000;
   }
 public static void main(String[] args) {
	 Bank b=new Bank();
	 System.out.println(b.loan());
	 System.out.println(b.loan(30000));
	 System.out.println(b.loan(30000,500000));
 }
}