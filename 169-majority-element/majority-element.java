class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
         Arrays.sort(nums);
     int cand=nums[n/2];
      int count =0;
     for(int i=0;i<n;i++){
      
        if(nums[i]==cand){
            count++;
        }
       
     }
     if(count>n/2){
        return cand;
     }
     return -1;
    }
}