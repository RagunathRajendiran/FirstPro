package LoopIndexArrayCondition;

public class PrintBulkInitialision {
       public static void main(String[] args) {
		int[] nums= {10,20,30,40,50,60};
		for(int i=0;i<nums.length/2;i++) {

			System.out.println(nums[i]);
		}
		for(int i=nums.length/2;i<nums.length;i++) {
			System.out.println("**"+nums[i]);
		}
	}
	
}
