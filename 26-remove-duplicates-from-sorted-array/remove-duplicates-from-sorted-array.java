class Solution {
    public int removeDuplicates(int[] nums) {
      int l=0;
      int r=1;
      while(r<nums.length){
        if(nums[r]==nums[r-1]){
            r++;
            continue;
        }
        nums[l+1]=nums[r];
        l++;
        r++;
      }  
      return l+1;
    }
}