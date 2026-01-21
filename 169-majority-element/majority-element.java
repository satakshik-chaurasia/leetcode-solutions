class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
         int cand=0;
         int count=0;
         for(int i=0;i<n;i++){
            int num=nums[i];
            if(count==0){
                
                cand=num;
            }
            if(num==cand){
                count++;
            }else
        {
            count--;
        }
         }return cand;
    }
}