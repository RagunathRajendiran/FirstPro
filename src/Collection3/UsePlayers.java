package Collection3;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
public class UsePlayers {
   public static void main(String[] args) {
	Players p1=new Players("RahulDravid",54,"India",19,1500000);
	Players p2=new Players("Dhoni",46,"India",07,100000);
	Players p3=new Players("RickyPanting",54,"Austria",98,1600000);
	Players p4=new Players("Jeyavarthane",58,"Srilanga",54,1200000);
	Players p5=new Players("InsamamPollak",54,"Pakistan",15,900000);
	Players p6=new Players("SachinTendulkar",56,"India",10,1800000);
	
	ArrayList<Players>pl=new ArrayList<>();
	pl.add(p1);
	pl.add(p2);
	pl.add(p3);
	pl.add(p4);
	pl.add(p5);
	pl.add(p6);
	
//	List<String>pg=pl.stream().filter(n->n.getAge()<50).map(c->c.getName()).collect(Collectors.toList());
//	pg.forEach(m->System.out.println(m));
//	List<String>pj=pl.stream().map(c->c.getName()).filter(c->c.startsWith("R")).collect(Collectors.toList());	
  //    System.out.println(pj);
//	Long t=pl.stream().map(c->c.getName()).filter(c->c.startsWith("R")).count();
//	System.out.println(t);
	Map<Integer,Players>w=pl.stream().filter(y->y.getAge()>30 && y.getRuns()>=1500000).
			collect(Collectors.toMap(x->x.getJercyNo(),y->y ));
	w.forEach((x,y)->System.out.println(x+" "+y));
	
   }
	

}
