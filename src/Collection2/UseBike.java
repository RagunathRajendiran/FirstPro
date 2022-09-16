package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
 public static void main(String[] args) {
	Bike b1=new Bike("HeroHonda",3456,"Black",75000,true);
	Bike b2=new Bike("TVSChamp",8760,"Gray",55000,true);
	Bike b3=new Bike("Platina",3458,"Red",60000,true);
	Bike b4=new Bike("KTM",9087,"Orange",85000,true);
	Bike b5=new Bike("RoyalEnfield",8654,"White",100000,false);
	Bike b6=new Bike("R15",7656,"Blue",150000,true);
	
	HashMap<Integer,Bike>bikes=new HashMap<>();
	bikes.put(b1.getRegisterNo(), b1);
	bikes.put(b2.getRegisterNo(), b2);
	bikes.put(b3.getRegisterNo(), b3);
	bikes.put(b4.getRegisterNo(), b4);
	bikes.put(b5.getRegisterNo(), b5);
	bikes.put(b6.getRegisterNo(), b6);
	//key Itration;
	//for(Integer v:bikes.keySet()) {
	//	System.out.println(v);
//	}
 
	//Value Itration;
	//	for(Bike u:bikes.values()) {
		//	System.out.println(u);
		
	//
	
		//value set by key;
		//for(Integer x:bikes.keySet()) {
		//	System.out.println(bikes.get(x));
		//}
//		Iterator<Integer>ite=bikes.keySet().iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		Iterator<Bike>it=bikes.values().iterator();
		while(it.hasNext()) {
			
			if(it.next().getBrand().equals("Platina")) {
		     it.remove();
			}
			}
		
		
			System.out.println(bikes);
		Iterator<Bike>ih=bikes.values().iterator();
		while(ih.hasNext()) {
			if(ih.next().getIsPetrol()==true) {
				ih.remove();
			}
			
		}
	System.out.println(bikes);
 }
}
	


