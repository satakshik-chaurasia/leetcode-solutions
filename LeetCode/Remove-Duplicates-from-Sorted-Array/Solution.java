1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int l=0;
4        int r=1;
5        int k=1;
6        int n=nums.length;
7        while(r<n&&k<n){
8            if(nums[r]==nums[r-1]){
9                r++;
10                continue;
11            }
12            nums[l+1]=nums[r];
13            l++;
14            r++;
15            k++;
16        }
17        return k;
18    }
19}