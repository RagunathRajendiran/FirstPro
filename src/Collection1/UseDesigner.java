package Collection1;

import java.util.ArrayList;

public class UseDesigner {
   public static void main(String[] args) {
	   Designer d1=new Designer("HR","Pandiyan",400000,"java",true,"TCS");
	   Designer d2=new Designer("HR","Kannaiyan",420000,"javaScript",true,"Intellct");
	   Designer d3=new Designer("HR","Kalaiyazhaki",400000,"java",false,"Infosis");
	   Designer d4=new Designer("HR","Selvi",460000,"Phython",false,"Cognisant");
	   Designer d5=new Designer("TL","Meiyappan",350000,"java",true,"TCS");
	   Designer d6=new Designer("TL","Padaiyappa",300000,"Phython",true,"Cognisant");
	   Designer d7=new Designer("TL","Mathavan",340000,"javaScript",true,"Intellct");
	   Designer d8=new Designer("TL","Malarkodi",310000,"java",false,"Infosis");
	   Designer d9=new Designer("Senior","Selva",230000,"Phython",true,"TCS");
	   Designer d10=new Designer("Senior","Selvalakshmi",330000,"javaScript",true,"Intellect");
	   Designer d11=new Designer("Senior","Ragavan",320000,"java",true,"Cognisant");
	   Designer d12=new Designer("Senior","Pandiyan",300000,"Phython",true,"Infosis");
	   
	   ArrayList<Designer>designer=new ArrayList<>();
	   designer.add(d1);
	   designer.add(d2);
	   designer.add(d3);
	   designer.add(d4);
	   designer.add(d5);
	   designer.add(d6);
	   designer.add(d7);
	   designer.add(d8);
	   designer.add(d9);
	   designer.add(d10);
	   designer.add(d11);
	   designer.add(d12);
	   
	   ArrayList<Designer>dl=new ArrayList<>();
	   for(int i=0;i<designer.size();i++) {
		   if(designer.get(i).getDesignation().equalsIgnoreCase("HR")) {
			   dl.add(designer.get(i));
		   }
	   }
	   dl.forEach(n->System.out.println(n.getName()));
	   
//	   ArrayList<Designer>dm= new ArrayList<>();
//	   for(Designer h:designer) {
//		   if(h.getDesignation().equalsIgnoreCase("TL")) {
//			   dm.add(h);
//		   }
//	   }
//	   dm.forEach(i->System.out.println(i));
//	   
//	   ArrayList<Designer>dn=new ArrayList<>();
//	   designer.forEach(m->{
//		   if(m.getDesignation().equalsIgnoreCase("Senior")) {
//			   dn.add(m);
//		   }
//	   });
//	   dn.forEach(j->System.out.println(j.getCompanyName()));
   }
	
}
