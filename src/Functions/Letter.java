package Functions;

public class Letter {
      public void MiddleLetter(String a) {
    	  if(a.length()%2==0) {
    		  System.out.println(a.substring(a.length()/2-1,a.length()/2+1));
    		  
    	  }else {
    		  System.out.println(a.substring(a.length()/2,a.length()/2+1));
    	  }
      }
     
}
	
   



