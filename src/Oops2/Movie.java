package Oops2;

public class Movie {
      String name;
      int noOfFights;
      int noOfSongs;
      public String review(int noOfSongs) {
    	  if(noOfSongs>2) {
    		  return "Good Movie";
    	  }else if(noOfSongs<=2) {
    		  return "not Good Movie";
    	  }
    	  else {
    		  return "ok";
    	  }
      }
      public Movie(String name,int noOfFights,int noOfSongs) {
    	  this.name=name;
    	  this.noOfFights=noOfFights;
    	  this.noOfSongs=noOfSongs;
    	  
      }
	public String toString() {
		return "Name: "+name+", NoOfFights: "+noOfFights+", NoOfSongs :"+noOfSongs;
	}

}
