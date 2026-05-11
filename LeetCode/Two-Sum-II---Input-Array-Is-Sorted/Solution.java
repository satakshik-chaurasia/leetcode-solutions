1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int i=0;
4        int j=nums.length-1;
5        while(i<j){
6            int sum=nums[i]+nums[j];
7            if(sum==target){
8                return new int[]{i+1,j+1};
9            }
10            else if(sum<target){
11                i++;
12            }
13            else if(sum>target){
14                j--;
15            }
16
17        }
18        return new int[]{};
19    }
20}