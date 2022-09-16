package Oops2;

public class Electronics {
   String typeOfBoard;
   int noOfChips;
   boolean isValiable;
   public Electronics(String typeOfBoard,int noOfChips,boolean isValiable) {
	   this.typeOfBoard=typeOfBoard;
	   this.noOfChips=noOfChips;
	   this.isValiable=isValiable;
   }
  	public String toString() {
  		return typeOfBoard+" "+noOfChips+" "+isValiable;
  	}

}
