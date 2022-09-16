package Oops2;

public class Student extends Human {
	int id;
	int numberOfYears;
	String department;
	public Student(String name,int age,int height,boolean isMale,
			int id,int numberOfYears,String department) {
		super(name,age,height,isMale);
		this.id=id;
		this.numberOfYears=numberOfYears;
		this.department=department;
		
	}
 	public String toString() {
 		return super.toString()+",Id: "+id+", Year: "+numberOfYears+",Department: "+department;
 	}

	

}
