package Collection4;

public class CheckBrand {
public static void main(String[] args) throws BrandNotFoundException{
	String[] brand= {"Otto","Ramraj","Lycra","Anand"};
	try {
		for(int i=0;i<brand.length;i++) {
		if(brand[i].equals("Otto")) {
			throw new BrandNotFoundException("isBranded");
		}
		else {
			System.out.println("isNotBranded");
		}
	}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	

}
