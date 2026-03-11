class Solution {
    public int findDuplicate(int[] nums) {
       int l=0;
       int r=1;
       Arrays.sort(nums);
       int n=nums.length;
       while(l<n&&r<n){
     if(nums[l]!=nums[r]){
        l++; 
        r++;
     }
     else{
        return nums[l];
     }
       }
       return -1;
    }
}