package Collection1;

import java.util.ArrayList;

public class UseEmployee {
 public static void main(String[] args) {
	Employee e1=new Employee("Raja",101,27,40000,true);
	Employee e2=new Employee("Ravi",102,28,42000,true);
	Employee e3=new Employee("Ragu",103,27,45000,true);
	Employee e4=new Employee("Keerthi",104,26,46000,false);
	Employee e5=new Employee("Samantha",105,32,48000,false);
	
	ArrayList<Employee>emp=new ArrayList<>();
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	emp.add(e5);
//	for(int i=0;i<emp.size();i++) {
//		System.out.println(emp.get(i).getEmpName());
//	}
//	emp.forEach(v->System.out.println(v.getEmpAge()));
//
	
	
//	String name=" ";
//	for(int i=0;i<emp.size();i++) {
//		if(emp.get(i).getEmpSalary()>=45000) {
//			name=emp.get(i).getEmpName();
//			System.out.println(name);
//		}
//	}
// 
//String h=" ";
//int b=emp.get(1).getEmpName().length();
//
//for(int i=0;i<emp.size();i++) {
//	if(emp.get(i).getEmpName().length()<=b) {
//		b=emp.get(i).getEmpName().length();
//		h=emp.get(i).getEmpName();
//	}
//}
//System.out.println(h);
//	emp.forEach(x-> {
//		if(x.getEmpAge()>=26) {
//			System.out.println(x.getEmpName());
//		}
//	});
    //String m=" ";
    for(int i=0;i<emp.size();i++) {
    	if(emp.get(i).getEmpName().startsWith("S")) {
    		System.out.println(emp.get(i));
    		
    	}
    }
    String d=" ";
    for(Employee y:emp) {
    	if(y.getIsMale()==false) {
    		d=y.getEmpName();
    		System.out.println(d);
    	}
    }
    }
	

 }
