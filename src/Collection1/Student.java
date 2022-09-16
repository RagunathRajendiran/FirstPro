package Collection1;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private boolean isMale;
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
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Student(String name, int age, int rollNo, boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.isMale = isMale;
	}

	public String toString() {
		return "name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", isMale=" + isMale ;
	}
    
	
}
