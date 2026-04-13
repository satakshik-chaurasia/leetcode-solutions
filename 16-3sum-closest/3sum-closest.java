class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        int ans=nums[1]+nums[0]+nums[2];
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=n-1;
            while(l<r){
              sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return sum;
                }
 if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;}
                if(sum<target){
                  l++;
                }
                else{
                    r--;
                }
               
                
            }
        }
return ans;
    }
}