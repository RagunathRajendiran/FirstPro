package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {
    public static void main(String[] args) {
		Mobile m1=new Mobile("Nokia",10000,true);
		Mobile m2=new Mobile("Samsung",1000,false);
		Mobile m3=new Mobile("Oppo",8000,true);
		
		ArrayList<Mobile>mb=new ArrayList<>();
		mb.add(m1);
	    mb.add(m2);
	    mb.add(m3);
	    
	    List<Mobile>ml=mb.stream().filter(y->y.getIsWarranty()==true).collect(Collectors.toList());
	    ml.forEach(u->System.out.println(u.getBrand()+" "+(u.getPrice()-999)));
		
		List<Integer>pr=mb.stream().filter(y->y.getIsWarranty()==true).map(k->k.getPrice()-999).collect(Collectors.toList());
		pr.forEach(u->System.out.println(u));
		
	}
	
}
