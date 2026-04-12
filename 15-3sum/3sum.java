class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> map=new ArrayList<>();
        int n=nums.length;
        int sum=0;
     for(int i=0;i<n-2;i++){
        if(i > 0 && nums[i] == nums[i - 1]) continue;
        int l=i+1;
        int r=n-1;
        while(l<r){
         int s=-1*nums[i];
         sum=nums[l]+nums[r];
         if(sum==s){
         map.add(Arrays.asList(nums[i],nums[l],nums[r]));
         l++;
         r--;
         while(l<n&&nums[l]==nums[l-1]){
            l++;
         }
         while(l<r&&nums[r]==nums[r+1]){
            r--;
         }
         }
         else if(sum<s){
               l++;
         }
         else{
            r--;
         }
     }}
     return map;
    }
}