package Collection1;

import java.util.ArrayList;

public class UseWatch {
    public static void main(String[] args) {
    	Watch w1=new Watch("Rolax",150000,true,true);
    	Watch w2=new Watch("Remand",25000,true,true);
    	Watch w3=new Watch("Rostr",3000,true,true);	
    	Watch w4=new Watch("Dymand",1000,true,true);
    	Watch w5=new Watch("Anand",150,false,false);
    	Watch w6=new Watch("Cool",100,false,false);
    	Watch w7=new Watch("Platina",20000,true,true);
    	Watch w8=new Watch("Apple",150000,true,true);
    	Watch w9=new Watch("Samsung",10000,true,true);
    	Watch w10=new Watch("Gioni",1500,true,true);
    	Watch w11=new Watch("Orient",3000,true,true);
    	Watch w12=new Watch("Butterfly",20000,true,false);
    	
    	ArrayList<Watch>watch=new ArrayList<>();
    	watch.add(w1);
    	watch.add(w2);
    	watch.add(w3);
    	watch.add(w4);
    	watch.add(w5);
    	watch.add(w6);
    	watch.add(w7);
    	watch.add(w8);
    	watch.add(w9);
    	watch.add(w10);
    	watch.add(w11);
    	watch.add(w12);
    	
    	ArrayList<Watch>collect=new ArrayList<>();
    	
//    	for(int i=0;i<watch.size();i++) {
//    		if(watch.get(i).getPrice()<3000) {
//    			collect.add(watch.get(i));
//    			
//    		}
//    	}
//    	
//    	collect.forEach(e->System.out.println(e));
//    	
//    	for(Watch l:watch) {
//    		if(l.getPrice()<3000) {
//    			collect.add(l);
//    		}
//    	}
//    	collect.forEach(e->System.out.println(e.getName()));
//    	
    	watch.forEach(n->{
    		if(n.getPrice()>3000) {
    			collect.add(n);
    		}
    	});
    	collect.forEach(m->System.out.println(m.getName()));
    }
	

}
