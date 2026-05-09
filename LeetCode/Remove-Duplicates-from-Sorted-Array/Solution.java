1class Solution {
2    public int removeDuplicates(int[] nums) {
3      int l=0;
4      int r=1;
5      while(r<nums.length){
6        if(nums[r]==nums[r-1]){
7            r++;
8            continue;
9        }
10        nums[l+1]=nums[r];
11        l++;
12        r++;
13      }  
14      return l+1;
15    }
16}