package LoopIndexArrayCondition;

public class PrintMarks {
	public static void main(String[] args) {
		int[] marks= {65,73,26,35,65,27,82,31,56,76,26};
		int aCount=0;
		int bCount=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>1 && marks[i]<=50) {
				aCount=aCount+1;
			}else  {
				bCount=bCount+1;
			}
		}
		System.out.println("A Count "+aCount);
		System.out.println("B Count "+bCount);
	}



}
