class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int l=0;
        int r=k;
       for(int i=0;i<k;i++){
           sum=sum+nums[i];
       } 
       int max=sum;
       while(r<n){
          
           sum=sum-nums[l];
           sum=sum+nums[r];
            max=Math.max(max,sum);
           l++;
           r++;
       }
      
       return (double) max/k;
    }
}