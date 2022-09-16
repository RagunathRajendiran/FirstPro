package Oops2;

public class Human {
       String name;
       int age;
       int height;
       boolean isMale;
       public Human(String name,int age,int height,boolean isMale) {
    	   this.name=name;
    	   this.age=age;
    	   this.height=height;
    	   this.isMale=isMale;
       }
	public String toString() {
		return "Name: "+name+",Age :"+age+", Height: "+height+",IsMale : "+isMale;
	}

}
