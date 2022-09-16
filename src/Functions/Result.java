package Functions;

public class Result {
	public String total() {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		return "TOTAL: "+(a+b+c+d+e);
	}
  public String average(int a,int b,int c,int d,int e) {
	  return "AVERAGE: "+(a+b+c+d+e)/5;
  }
	public static void main(String[] args) {
		Result results=new Result();
		System.out.println(results.total());
		System.out.println(results.average(10, 20, 30,40, 50));
	}

}
