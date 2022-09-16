package Conditions;

public class UseWatch {
   public static void main(String[] args) {
	Watch w1=new Watch();
	w1.brand="Rolax";
	w1.price=10000000;
	w1.color="Gold";
	w1.isWaterProof=true;
	if(w1.isWaterProof==true) {
		System.out.println(w1.price-(w1.price*5/100));
	}else {
		System.out.println(w1.price+(w1.price*5/100));
	}
}
	

}
