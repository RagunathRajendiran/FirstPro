package Oops1;

public class Battery {
     private String brand;
     private int price;
     private boolean isChargedType;
     public void setBrand(String brand) {
    	 this.brand=brand;
     }
     public String getBrand() {
    	 return this.brand;
     }
     public void setPrice(int price) {
    	 this.price=price;
     }
     public int getPrice() {
    	 return this.price;
     }
     public void setIsChargedType(boolean isChargedType) {
    	 this.isChargedType=isChargedType;
     }
     public boolean getIsChargedType() {
    	 return this.isChargedType;
     }

}
