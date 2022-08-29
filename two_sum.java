package LeetCode;

import java.util.Scanner;
import java.util.HashMap;

/* changes to be made */
// use dynamic arrays instead of fixed size arrays

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length; i++){
             int n2 = target - nums[i];
            if(map.containsKey(n2) && map.get(n2) != i){
                int[] arr = {i, map.get(n2)};
                return arr;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

public class two_sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}
		int target = scan.nextInt();
		Solution sol = new Solution();
		int[] res = sol.twoSum(arr, target);
		System.out.println(res[0] + " " + res[1]);
		
	}
	
}
