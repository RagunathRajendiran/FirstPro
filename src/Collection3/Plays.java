package Collection3;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Plays {

	 public static void main(String[] args) {
			Players p1=new Players("RahulDravid",54,"India",19,1500000);
			Players p2=new Players("Dhoni",46,"India",07,100000);
			Players p3=new Players("RickyPanting",54,"Austria",98,1600000);
			Players p4=new Players("Jeyavarthane",58,"Srilanga",54,1200000);
			Players p5=new Players("InsamamPollak",54,"Pakistan",15,900000);
			Players p6=new Players("SachinTendulkar",56,"India",10,1800000);
			
			HashMap<Integer,Players>pl=new HashMap<>();
			pl.put(p1.getJercyNo(), p1);
			pl.put(p2.getJercyNo(), p2);
			pl.put(p3.getJercyNo(), p3);
			pl.put(p4.getJercyNo(), p4);
			pl.put(p5.getJercyNo(), p5);
			pl.put(p6.getJercyNo(), p6);
			
		//	List<String>lk=pl.values().stream().filter(y->y.getAge()>30 && y.getRuns()>=1500000).
		//			map(u->u.getName()).collect(Collectors.toList() );
		//	lk.forEach(l->System.out.println(l));
		Map<Integer,Players>bj=pl.values().stream().filter(y->y.getRuns()>=1500000).
			collect(Collectors.toMap(x->x.getJercyNo(),y->y ));
		bj.forEach((k,u)->System.out.println(k+" "+u));
			
}
}