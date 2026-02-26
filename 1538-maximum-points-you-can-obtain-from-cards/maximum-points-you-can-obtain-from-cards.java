class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        // int sum=0; 
       int max=0;
        for(int i=0;i<k;i++){
       sum+=nums[i];
        }
        max=sum;
        int r=n-1;
        for(int i=k-1;i>=0;i--){
            sum=sum-nums[i]+nums[r];
            r--;
            max=Math.max(sum,max);
        }
        return max;

    }
}