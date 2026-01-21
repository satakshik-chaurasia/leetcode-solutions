class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;

        // Step 1: find max element and its index
        int max = 0;
        int idx = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }

        // Step 2: check dominant condition
        for(int i = 0; i < n; i++) {
            if(i != idx && max < 2 * nums[i]) {
                return -1;
            }
        }

        return idx;
    }
}
