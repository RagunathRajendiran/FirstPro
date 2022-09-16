package Oops3;

public class Ac implements HomeApplains,Electronics {
	public String type() {
		return "CoolingType";
	}
	public  boolean isSafe() {
		return true;
	}
	public boolean isMatherBoard() {
		return true;
	}
    public String shape() {
    	return "Cylendrical";
    }
	
  public static void main(String[] args) {
	  Ac ac=new Ac();
		System.out.println(ac.shape()+" "+ac.type()+" "+ac.isMatherBoard()+" "+ac.isSafe());
	
}
}
