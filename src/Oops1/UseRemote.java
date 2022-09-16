package Oops1;

public class UseRemote {
    public static void main(String[] args) {
		Batterys b=new Batterys();
		b.brand="DuraCell";
		b.price=15;
		b.isVaranty=false;
		
		Remote r=new Remote();
		r.brand="Airtel";
		r.price=80;
		r.color="White";
		r.battery=b;
		
		r.showRemoteDetails();
	}
	
}
