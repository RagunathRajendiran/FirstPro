package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
   public static void main(String[] args) {
	Student s1=new Student("Arivazhagan",26,"BE(Civil)",2135465758609l);
	Student s2=new Student("Anandharaj",25,"BE(CSC)",76094657587609l);
	Student s3=new Student("Kesavan",27,"BE(IT)",6677465756677l);
	Student s4=new Student("Danialraj",26,"BE(EEE)",2435465752435l);
	Student s5=new Student("Praveenraj",27,"BE(Civil)",5678465755678l);
	Student s6=new Student("Santhosh",28,"BE(Mechanical)",4325465758432l);
	
	HashMap<Long,Student>hp=new HashMap<>();
	hp.put(s1.getAadharNo(),s1);
	hp.put(s2.getAadharNo(),s2);
	hp.put(s3.getAadharNo(),s3);
	hp.put(s4.getAadharNo(),s4);
	hp.put(s5.getAadharNo(),s5);
	hp.put(s6.getAadharNo(),s6);
	
	//System.out.println(hp.keySet());
	//System.out.println(hp.values());
//	int k=0;
//	String m=" ";
//	for(Student n:hp.values()) {
//		if(n. getAge()>k) {
//			k=n.getAge();
//			m=n.getName();
//		
//		}	
//		}
//		System.out.println(m);
//	Iterator<Long>ite=hp.keySet().iterator();
//	while(ite.hasNext()) {
//		System.out.println(ite.next());
//		
//	}
//	Iterator<Student>it=hp.values().iterator();
//	while(it.hasNext()) {
//		if(it.next().getName().equals("Danialraj")) {
//			it.remove();
//		}
//        
//	}
//	
//	System.out.println(hp);
//	startsWith"S";
	Iterator<Student>std=hp.values().iterator();
	while(std.hasNext()) {
		if(std.next().getName().startsWith("S")) {
			std.remove();
		}
	}
	System.out.println(hp);
	
	//keyEven;
	Iterator<Student>ty=hp.values().iterator();
	while(ty.hasNext()){
		if(ty.next().getAadharNo()%2==0) {
			ty.remove();
		}
	}
	System.out.println(hp);
	}
	
}
	

