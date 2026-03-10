class Solution {
    public int maxProduct(int[] nums) {
       int i=0;
       int bestmax=nums[0];
       int bestmin=nums[0];
       int ans=nums[0];
       int n=nums.length;
       for(i=1;i<n;i++){
        int v1=nums[i];
        int v2=nums[i]*bestmax;
        int v3=nums[i]*bestmin;
        bestmax=Math.max(v1,Math.max(v2,v3));
        bestmin=Math.min(v1,Math.min(v2,v3));
        ans=Math.max(ans,Math.max(bestmin,bestmax));
        
       } 
       return ans;
    }
}