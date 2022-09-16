package LoopIndexArrayCondition;

public class PrintArrayNumbers {
     public static void main(String[] args) {
		int[] nums= {10,20,45,75,80};
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println("****"+nums[i]);
		}
	}
	

}
