package leetcode;

public class P1_TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i + 1; j < nums.length; j++) {
    			if(nums[i] + nums[j] == target) {
    				solution[0] = i;
    				solution[1] = j;
    			}    			
    		}
    	}  
    	return solution;
    }

    public static void main(String args[]){ 
    	int[] nums = {2, 7, 11, 15};
    	int target = 9;
    	P1_TwoSum obj = new P1_TwoSum();
    	int[] solution = obj.twoSum(nums, target);
    	System.out.println(solution[0] + ", " + solution[1]);
    }
}
