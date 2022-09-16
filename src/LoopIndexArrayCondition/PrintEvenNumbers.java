package LoopIndexArrayCondition;

public class PrintEvenNumbers {
     public static void main(String[] args) {
		int[] nums=new int[6];
		nums[0]=24;
		nums[1]=25;
		nums[2]=26;
		nums[3]=27;
		nums[4]=28;
		nums[5]=29;
		int addCount=0;
		int evenCount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				addCount=addCount+1;
				System.out.println(nums[i]+" is Even");
			}else {
				evenCount=evenCount+1;
				System.out.println(nums[i]+" is Odd");
			}
		}
		System.out.println("AddCount ="+addCount);
		System.out.println("EvenCount="+evenCount);
	}
	
}
