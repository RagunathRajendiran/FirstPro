package LoopIndexArrayCondition;

public class NumberOfCount {
  public static void main(String[] args) {
	  String[] words= {"Laptop","Mouse","Monitor","Cpu","Keyboards","Printer","webcome"};
	  
	  int singularCount=0;
	  int pluralCount=0;
	  for(int i=0;i<words.length;i++) {
		  if(words[i].endsWith("s")) {
			  
			  pluralCount=pluralCount+1;
		  }else {
			  singularCount=singularCount+1;
		  }
	  }
	  System.out.println("Plural Count ="+pluralCount);
	  System.out.println("Singular Count ="+singularCount);
}
	
}
