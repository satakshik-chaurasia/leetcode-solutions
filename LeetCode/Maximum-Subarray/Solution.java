1class Solution {
2    public int maxSubArray(int[] nums) {
3        int ans=nums[0];
4        int n=nums.length;
5        int i=0;
6        int best=nums[0];
7        for( i=1;i<n;i++){
8            int v1=best+nums[i];
9            int v2=nums[i];
10            best=Math.max(v1,v2);
11                ans=Math.max(best,ans);
12        }
13    
14       return ans; 
15    }
16}