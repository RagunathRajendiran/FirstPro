package Oops2;

public class Carnivore extends Animal {
    boolean isHuntingAnimal;
    String livingEnvironment;
    public Carnivore(boolean isHundingAnimal, String livingEnvironment,String name,
    		boolean isWildAnimal,int noOfLegs) {
    	super(name,isWildAnimal,noOfLegs);
    	this.isHuntingAnimal=isHundingAnimal;
    	this.livingEnvironment=livingEnvironment;
    }
	public String toString() {
		return super.toString()+",Hund: "+isHuntingAnimal+", LivingEnvironment: "+livingEnvironment;
	}
}
