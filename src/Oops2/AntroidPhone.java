package Oops2;

public class AntroidPhone extends Mobile {
 boolean isAntroidPhone;
 public AntroidPhone(String typeOfBoard,int noOfChips,boolean isValiable,String name,int price,boolean isChargeable) {
	 super (typeOfBoard, noOfChips, isValiable, name,price, isChargeable);
	 this.isAntroidPhone=isAntroidPhone;
 }
	public String toString() {
		return super.toString()+" "+isAntroidPhone;
	}

}
