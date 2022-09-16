package Collection1;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student std1=new Student("Punitha",18,103,false);
		Student std2=new Student("Ananthakrishnan",17,104,true);
		Student std3=new Student("RamyaKrishnan",18,105,false);
		Student std4=new Student("Ramanuja",16,106,true);
		ArrayList<Student>std=new ArrayList<>();
		std.add(std1);
		std.add(std2);
		std.add(std3);
		std.add(std4);
//		for(int i=0;i<std.size();i++) {
//			System.out.println(std.get(i));
//		}
//		for(Student d:std) {
//			System.out.println(d);
//		}
//		std.forEach(g->System.out.println(g));
//		ArrayList<Student>femaleList=new ArrayList<>();
//		for(Student em:std) {
//			if(em.isMale()==false) {
//			femaleList.add(em);
//		}
//	}
//femaleList.forEach(x-> System.out.println(x));
//      
// ArrayList<Student>rollNoList=new ArrayList<>();
// for(Student rn: std) {
//	 if(rn.getRollNo()>104) {
//		 rollNoList.add(rn);
//		 
//	 }
// }
//rollNoList.forEach(d->System.out.println(d));
// ArrayList<Student>nameLength=new ArrayList<>();
// for(Student lu:std) {
//	 if(lu.getName().length()>9) {
//		 nameLength.add(lu);
//	 }
//	 
// }
//	nameLength.forEach(kl->System.out.println(kl));
		
	ArrayList<Student>gh=new ArrayList<>();
	for(Student hp:std) {
		if(hp.getName().length()%2==0) {
			gh.add(hp);
		}
	}
		gh.forEach(u->System.out.println(u));
	}
}
