1class Solution {
2    public int maxScore(int[] nums, int k) {
3        int n=nums.length;
4        int max=0;
5        int sum=0;
6        for(int i=0;i<k;i++){
7            sum+=nums[i];
8        }
9        max=sum;
10        int l=k-1;
11        int r=n-1;
12        while(l>=0){
13            sum=sum-nums[l];
14            l--;
15            sum=sum+nums[r];
16            r--;
17            max=Math.max(sum,max);
18        }
19        return max;
20    }
21}