package Oops2;

public class ActionMovie extends Movie {
     String actorName;
     boolean isTamilMovie;
     public String review(int noOfSongs) {
    	 if(noOfSongs<=2) {
    		 return "Bad Action Movie";
    	 }
    	 else if(noOfSongs>2 && noOfSongs<=5) {
    		 return "Good Action Movie";
    	 }
    	 else if(noOfSongs>5) {
    		 return "Supeer Action Movie";
    	 }else {
    		 return "Invalid";
    	 }
     }
	public ActionMovie(String name,int noOfFights,int noOfSongs,String actorName,boolean isTamilMovie) {
		super(name,noOfFights,noOfSongs);
		this.actorName=actorName;
		this.isTamilMovie=isTamilMovie;
	}
	public String toString() {
		return super.toString()+",Actor Name: "+actorName+", isTamilMovie: "+isTamilMovie;
	}
}
