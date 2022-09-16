package Oops2;

public class Animal {
    String name;
    boolean isWildAnimal;
    int noOfLegs;
    public Animal(String name,boolean isWildAnimal,int noOfLegs) {
    	this.name=name;
    	this.isWildAnimal=isWildAnimal;
    	this.noOfLegs=noOfLegs;
    	
    }
    public String toString() {
    	return "Name :"+name+", IsWildAnimal: "+isWildAnimal+", NoOfLegs "+noOfLegs;
    }
	}
