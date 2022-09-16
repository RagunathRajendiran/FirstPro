package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Examble1 {
      public static void main(String[] args) {
    	  ArrayList<Integer>l=new ArrayList<>();
    	  l.add(256);
    	  l.add(457);
    	  l.add(370);
    	  l.add(435);
    	  l.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
         List<Integer>even=l.stream().filter(x->x%2==0).collect(Collectors.toList());
         System.out.println(even);
    	  Long c=l.stream().filter(x->x%2==0).count();
    	  System.out.println(c);
      }
	
}
