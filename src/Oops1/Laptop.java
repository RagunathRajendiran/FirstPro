package Oops1;

public class Laptop {
  private String brand;
  private int price;
  private String processor;
  private int ram;
  private String color;
  private Battery battery;
  public void setBrand(String brand) {
	this. brand =brand;
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
  public void setProcessor(String processor) {
	  this.processor=processor;
  }
  public String getProcessor() {
	  return this.processor;
  }
  public void setRam(int ram) {
	  this.ram=ram;
  }
  public int getRam() {
	  return this.ram;
  }
  public void setColor(String color) {
	  this.color=color;
  }
  public String getColor() {
	  return this.color;
  }
  public void setBattery(Battery battery) {
	  this.battery=battery;
  }
  public Battery getBattery() {
	  return this.battery;
  }
}
