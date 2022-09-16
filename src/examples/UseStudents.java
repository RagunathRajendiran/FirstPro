package examples;

public class UseStudents {
      public static void main(String[] args) {
		Students s1=new Students();
		s1.name="Siva";
		s1.id=234;
		s1.age=14;
		s1.std="IX";
		s1.attendancePercentage=75;
		s1.noOfDaysPercent=240*s1.attendancePercentage/100;
		Students s2=new Students();
		s2.name="mani";
		s2.id=236;
		s2.age=15;
		s2.std="X";
		s2.attendancePercentage=80;
		s2.noOfDaysPercent=240*s2.attendancePercentage/100;
		Students s3=new Students();
		s3.name="valli";
		s3.id=237;
		s3.age=13;
		s3.std="VIII";
		s3.attendancePercentage=90;
		s3.noOfDaysPercent=240*s3.attendancePercentage/100;
		System.out.println("Siva No Of Days Present in School ="+s1.noOfDaysPercent+";");
		System.out.println("Mani No Of Days Present in School ="+s2.noOfDaysPercent+";");
		System.out.println("Valli No Of Days Present in School ="+s3.noOfDaysPercent+";");
	}
	
}
