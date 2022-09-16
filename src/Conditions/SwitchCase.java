package Conditions;

public class SwitchCase {
    public static void main(String[] args) {
    	int weekDays=5;
		switch(weekDays) {
		case 1:System.out.println("SunDay");
		       break;
		case 2:System.out.println("MonDay");
               break;  
		case 3:System.out.println("TuesDay");
               break;
		case 4:System.out.println("WednesDay");
               break;
		case 5:System.out.println("ThursDay");
               break;
		case 6:System.out.println("FriDay");
               break;
		case 7:System.out.println("SaturDay");
               break;
         default:System.out.println("Invalid");
               break;
         }
	}
	
}
