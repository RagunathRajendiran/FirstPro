package Oops2;

public class MedicalStudent extends Student{
    String practiceType;
    boolean isSurgeon;
    public MedicalStudent(String name,int age,int height,boolean isMale,
			int id,int numberOfYears,String department,String practiceType,boolean isSurgeon ) {
     super(name,age,height,isMale,id,numberOfYears,department);
    	this.practiceType=practiceType;
    	this.isSurgeon=isSurgeon;
    }
	public String toString() {
		return super.toString()+",PracticeType"+practiceType+",IsSurgeon: "+isSurgeon;
	}

}
