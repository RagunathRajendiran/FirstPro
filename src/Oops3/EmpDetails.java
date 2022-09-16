package Oops3;

public class EmpDetails {
   public static void main(String[] args) {
	  Employee ey=new GovtEmp();
	  System.out.println(ey.gender()+" "+ey.pf()+" "+ey.insurance()+" "+ey.workingTime()+" "+ey.workShift());
	  Employee el=new PrivateEmp();
	  System.out.println(el.gender()+" "+el.pf()+" "+el.insurance()+" "+el.workingTime()+" "+el.workShift());
      Teacher p=new Teacher();
      System.out.println(p.gender()+" "+p.pf()+" "+p.insurance()+" "+p.workingTime()+" "+p.workShift()
                 +" "+p.name()+" "+p.salary()+" "+p.age());
      Conductors pl=new Conductors();
      System.out.println(pl.gender()+" "+pl.pf()+" "+pl.insurance()+" "+pl.workingTime()+" "+pl.workShift()
      +" "+pl.name()+" "+pl.salary()+" "+pl
      .age());
   
   
   }
}
