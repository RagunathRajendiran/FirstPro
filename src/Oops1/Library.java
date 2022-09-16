package Oops1;

public class Library {
    private String name;
    private String place;
    private int noOfDepartments;
    private int noOfFloors;
    public void setName(String name) {
    	this.name=name;
    }
    public String getname() {
    	return this.name;
    }
    public void setPlace(String place) {
    	this.place=place;
    }
    public String getPlace() {
    	return this.place;
    }
    public void setNoOfDepartments(int noOfDepartments) {
    	this.noOfDepartments=noOfDepartments;
    }
    public int getNoOfDepatments() {
    	return noOfDepartments;
    }
    public void setNoOfFloors(int noOfFloors) {
    this.noOfFloors=noOfFloors;  
    }
    public int getNoOfFloors() {
    	return this.noOfFloors;
    }
    public Library(String name,String place,int noOfDepartments,int noOfFloors) {
    	this.name=name;
    	this.place=place;
    	this.noOfDepartments=noOfDepartments;
    	this.noOfFloors=noOfFloors;
    }
	public String toString() {
		return "name:"+name+",Place: "+place+", NoOfDept: "+noOfDepartments+",NoOfFloor: "+noOfFloors;
	}

}
