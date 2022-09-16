package Collection4;

public class CheckMail {
  public static void main(String[] args) throws CheckMailIdException  {
	  String a="ragurajgmail.com";
	  try {
		  if(a.contains("@gmail.com")) {
			  throw new CheckMailIdException ("isGoogleId");
			  
		  }else {
			  throw new CheckMailIdException("isYahooId");
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	
}
	
}
