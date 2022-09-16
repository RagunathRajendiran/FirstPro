package Functions;

public class Pen {
  String brand;
  int price;
  String color;
  public String name(Pen a,Pen b,Pen c) {
	  if(a.brand.startsWith("A")) {
		  return a.color;
	  }else if(b.brand.startsWith("A")) {
		  return b.brand;
	  }else {
		  return c.brand;
	  }
  }
	

}
