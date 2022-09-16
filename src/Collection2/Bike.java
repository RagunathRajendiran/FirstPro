package Collection2;

public class Bike {
   private String brand;
   private int registerNo;
   private String colour;
   private int price;
   private boolean isPetrol;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRegisterNo() {
	return registerNo;
}
public void setRegisterNo(int registerNo) {
	this.registerNo = registerNo;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean getIsPetrol() {
	return isPetrol;
}
public void setIsPetrol(boolean isPetrol) {
	this.isPetrol = isPetrol;
}
public Bike(String brand, int registerNo, String colour, int price, boolean isPetrol) {
	this.brand = brand;
	this.registerNo = registerNo;
	this.colour = colour;
	this.price = price;
	this.isPetrol = isPetrol;
}

public String toString() {
	return "brand=" + brand + ", registerNo=" + registerNo + ", colour=" + colour + ", price=" + price
			+ ", isPetrol=" + isPetrol ;
}
   
	

}
