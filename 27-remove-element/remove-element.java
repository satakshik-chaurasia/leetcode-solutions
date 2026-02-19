class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        // Arrays.sort(nums);
        int l=0;
        for(int r=0;r<n;r++){
      
          if(nums[r]!=val){
         nums[l]=nums[r];
         l++;
          }}
        
        return l;
        // return nums;
    }
}