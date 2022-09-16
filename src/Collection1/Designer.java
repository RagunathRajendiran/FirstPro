package Collection1;

public class Designer {
     private String desingnation;
     private String  name;
     private int salary;
     private String software;
     private boolean isMale;
     private String companyName;
     public String getDesignation() {
    	 return desingnation;
     }
	 public String getName() {
		 return name;
	 }
	 public int getSalary() {
		 return salary;
	 }
	 public String getSoftWare() {
		 return software;
	 }
	 public boolean getIsMale() {
		 return isMale;
	 }
	 public String getCompanyName() {
		 return companyName;
	 }
	 public Designer(String desingnation,String name,int salary,String software,boolean isMale,String companyName) {
		 this.desingnation=desingnation;
		 this.name=name;
		 this.salary=salary;
		 this.software=software;
		 this.isMale=isMale;
		 this.companyName=companyName;
		 
	 }
	 public String toString() {
		 return desingnation+" "+name+" "+salary+" "+software+" "+isMale+" "+companyName;
	 }
}
