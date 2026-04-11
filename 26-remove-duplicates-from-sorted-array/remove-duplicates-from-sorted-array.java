class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int r=1;
        int k=1;
        int n=nums.length;
        while(r<n&&k<n){
            if(nums[r]==nums[r-1]){
                r++;
                continue;
            }
            nums[l+1]=nums[r];
            l++;
            r++;
            k++;
        }
        return k;
    }
}