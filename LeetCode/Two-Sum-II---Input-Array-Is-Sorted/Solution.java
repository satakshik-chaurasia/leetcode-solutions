1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n=nums.length;
4        int l=0;
5        int r=n-1;
6        int sum=0;
7        while(l<r){
8            sum=nums[l]+nums[r];
9            if(sum==target){
10                return new int[]{l+1,r+1};
11            }
12            else if(sum>target){
13                r--;
14            }
15            else{
16                l++;
17            }
18        }
19        return new int[]{-1,-1};
20    }
21}