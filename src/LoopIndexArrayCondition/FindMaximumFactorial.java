package LoopIndexArrayCondition;

public class FindMaximumFactorial {
    public static void main(String[] args) {
		int[] nums= {2,4,5,6,8};
		int a=0;
		int b=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>a) {
				a=nums[i];
				}
		}
		//System.out.println(a);
		for(int i=a;i>=1;i--) {
			b=b*i;
		}
		System.out.println(a+" factorial number is="+b);
	}


}
