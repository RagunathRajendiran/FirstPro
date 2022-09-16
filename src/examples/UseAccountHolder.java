package examples;

public class UseAccountHolder {
       public static void main(String[] args) {
		  AccountHolder ah1=new AccountHolder();
		  ah1.name="Mano";
		  ah1.age=26;
		  ah1.gender="male";
		  ah1.accountNo=28330485612583l;
		  ah1.monthlyIncome=21000;
		  ah1.savingPercentage=18;
		  int save1=ah1.monthlyIncome*ah1.savingPercentage/100;
		  AccountHolder ah2=new AccountHolder();
		  ah2.name="Savirthiri";
		  ah2.age=25;
		  ah2.gender="Female";
		  ah2.accountNo=28330485612584l;
		  ah2.monthlyIncome=20000;
		  ah2.savingPercentage=20;
		  int save2=ah2.monthlyIncome*ah2.savingPercentage/100;
		  AccountHolder ah3=new AccountHolder();
		  ah3.name="Kamban";
		  ah3.age=30;
		  ah3.gender="Male";
		  ah3.accountNo=28330485612585l;
		  ah3.monthlyIncome=30000;
		  ah3.savingPercentage=10;
		  int save3=ah3.monthlyIncome*ah3.savingPercentage/100;
		  System.out.println("Mano Savings ="+save1);
		  System.out.println("Savithiri Savings ="+save2);
		  System.out.println("Kamban Savings ="+save3);
		  
	}
	
}
