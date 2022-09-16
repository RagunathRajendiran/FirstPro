package Collection2;

public class Student {
   private String name;
   private int age;
   private String qualification;
   private long aadharNo;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public Student(String name, int age, String qualification, long aadharNo) {
	
	this.name = name;
	this.age = age;
	this.qualification = qualification;
	this.aadharNo = aadharNo;
}
@Override
public String toString() {
	return "name=" + name + ", age=" + age + ", qualification=" + qualification + ", aadharNo=" + aadharNo;
}
   
	
}
