import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;

        int ans = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < n - 2; i++) {

            // skip same first element (optional optimization)
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while(left < right) {

                int curr = nums[i] + nums[left] + nums[right];

                // update answer
                if(Math.abs(target - curr) < Math.abs(target - ans))
                    ans = curr;

                // pointer movement
                if(curr > target) {
                    right--;
                }
                else if(curr < target) {
                    left++;
                }
                else {
                    return target;   // exact match
                }
            }
        }
        return ans;
    }
}