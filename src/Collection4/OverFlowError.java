package Collection4;

public class OverFlowError {
   public void findA() {
	   findB();
   }
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		OverFlowError g=new OverFlowError();
		g.findA();
	}
}
