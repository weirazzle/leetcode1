package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class P1_TwoSumTest {

	@Test
	public void test1() {
		int[] nums = {2, 7, 11, 15};
    	int target = 9;
    	P1_TwoSum o = new P1_TwoSum();
    	int[] solution = o.twoSum(nums, target);
    	System.out.println(solution[0] + ", " + solution[1]);
    	int[] expected = {0, 1};
    	assertArrayEquals(expected, solution);

	}
	
	@Test
	public void test2() {
		int[] nums = {3, 2, 4};
    	int target = 6;
    	P1_TwoSum o = new P1_TwoSum();
    	int[] solution = o.twoSum(nums, target);
    	System.out.println(solution[0] + ", " + solution[1]);
    	int[] expected = {1, 2};
    	assertArrayEquals(expected, solution);
	}


}
