1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int l=0;
4        int r=1;
5        int n=nums.length;
6        while(l<n&&r<n){
7if(nums[l]!=nums[r]){
8    l++;
9    nums[l]=nums[r];
10}
11r++;
12        }
13        return l+1;
14    }
15}