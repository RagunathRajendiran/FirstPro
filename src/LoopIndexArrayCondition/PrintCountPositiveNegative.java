package LoopIndexArrayCondition;

public class PrintCountPositiveNegative {
  public static void main(String[] args) {
	    int[] nums={-1,2,-3,-7,8,10,11,12,17};
	    int negativeCount=0;
	    int positiveCount=0;
	    for(int i=0;i<nums.length;i++) {
		if(nums[i]<0) 
		{
			negativeCount=negativeCount+1;
	          		
	    }
		else 
		{
		    positiveCount=positiveCount+1;
	    }
        }
        System.out.println("Negative Count ="+negativeCount);
        System.out.println("Positive Count ="+positiveCount);
        }
        }
