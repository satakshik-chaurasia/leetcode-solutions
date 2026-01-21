class Solution {
    public int dominantIndex(int[] nums) {
      int n=nums.length;
      int[] temp=nums.clone();
      Arrays.sort(temp);
        int max=temp[n-1];
        int sec=temp[n-2];
        if(max<2*sec)
        return -1;
        for(int i = 0; i < n; i++) {
            if(nums[i] == max) return i;
        }

        return -1;
    }
}