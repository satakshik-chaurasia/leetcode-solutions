1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n=nums.length;
4        int l=0;
5        int sum=0;
6        int min=Integer.MAX_VALUE;
7        for(int r=0;r<n;r++){
8            sum+=nums[r];
9        
10        while(sum>=target){
11            min=Math.min(min,r-l+1);
12            sum-=nums[l];
13            l++;
14        }}
15        if(min==Integer.MAX_VALUE){
16            return 0;
17        }
18        else{
19            return min;
20        }
21    }
22}