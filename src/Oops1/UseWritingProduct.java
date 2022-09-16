package Oops1;

public class UseWritingProduct {
    public static void main(String[] args) {
    	Refill r=new Refill();
    	r.color="Blue";
    	r.price=5;
    	r.isRefill=true;
    	
    	
    	Pen p=new Pen();
    	p.brand="Renolds";
    	p.price=10;
    	p.shape="Cylendrical";
    	p.refill=r;
    	
    	System.out.println(p.brand+" "+p.price+" "+p.shape+" "+p.refill.color);
    }


}
