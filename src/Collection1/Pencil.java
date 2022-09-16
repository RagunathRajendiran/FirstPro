package Collection1;

import java.util.ArrayList;

public class Pencil {
  public static void main(String[] args) {
	ArrayList<String>pencilBrands=new ArrayList<>();
	pencilBrands.add("Apsara");
	pencilBrands.add("Nataraj");
	pencilBrands.add("Ji-bumba");
	pencilBrands.add("Renolds");
	pencilBrands.add("Cello");
	String l="";
	int m=0;
	for(int i=0;i<pencilBrands.size();i++) {
		
		System.out.println(pencilBrands.get(i).charAt(0));
	}

	for(String s:pencilBrands) {
		if(s.length()>m) {
			m=s.length();
			l=s;
			
		}
		
	}System.out.println("****"+l);

	for(int i=pencilBrands.size()-1;i>=0;i--) {
		System.out.println(pencilBrands.get(i));
	}
	pencilBrands.forEach(c->System.out.println("*****"+c.charAt(pencilBrands.size()-1)));
	int max=pencilBrands.get(0).length();
	String k=" ";
	for(int i=0;i<pencilBrands.size();i++) {
		if(pencilBrands.get(i).length()>max) {
			max=pencilBrands.get(i).length();
			k=pencilBrands.get(i);
		}
	}
	System.out.println(max+" "+k);
	
}
	
}
