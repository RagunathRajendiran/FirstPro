package Oops2;

public class Mobile extends Electronics{
    String name;
    int price;
    boolean isChargeable;
    public Mobile(String typeOfBoard,int noOfChips,boolean isValiable,String name,int price,boolean isChargeable) {
    	super( typeOfBoard,noOfChips, isValiable);
    	this.name=name;
    	this.price=price;
    	this.isChargeable=isChargeable;
    }
	public String toString() {
		return super.toString()+" "+name+" "+price+" "+isChargeable;
	}
}
