package Functions;

public class Number {
    public String letter(String a) {
    	 if(a.length()%2==0) {
   		  return(a.substring(a.length()/2-1,a.length()/2+1));
   		  
   	  }else {
   		  return (a.substring(a.length()/2,a.length()/2+1));
   	  }
    }
    public static void main(String[] args) {
		Number l=new Number();
		String a="Ragunath";
	    System.out.println(	l.letter(a));
	}


}
