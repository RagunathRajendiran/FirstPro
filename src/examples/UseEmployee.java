package examples;

public class UseEmployee {
     public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.employeeId=101;
		emp1.employeeName="Rajkumar";
		emp1.dateOfBirth="01-04-1985";
		emp1.mobileNo=8181056753l;
		Employee emp2=new Employee();
		emp2.employeeId=102;
		emp2.employeeName="Kamal";
		emp2.dateOfBirth="25-05-1991";
		emp2.mobileNo=8123458702l;
		System.out.println("Emp Id ="+emp1.employeeId+", Emp name ="+emp1.employeeName+", Date Of birth ="+
		emp1.dateOfBirth+", Mobile No =+91"+emp1.mobileNo);
		System.out.println("Emp Id ="+emp2.employeeId+", Emp Name ="+emp2.employeeName+", Date Of Birth ="+
		emp2.dateOfBirth+", MobileNo =+91"+emp2.mobileNo);
	}
	

}
