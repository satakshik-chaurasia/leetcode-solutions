1class Solution {
2    public int minSubArrayLen(int k, int[] nums) {
3        int n=nums.length;
4        int l=0;
5        int min=Integer.MAX_VALUE;
6        int sum=0;
7        for(int r=0;r<n;r++){
8            sum+=nums[r];
9            while(sum>=k){
10                min=Math.min(min,r-l+1);
11                sum-=nums[l];
12                l++;
13            }
14            
15        }
16    if(min==Integer.MAX_VALUE){
17        return 0;
18    }
19    else{
20        return min;
21    }
22    }
23}