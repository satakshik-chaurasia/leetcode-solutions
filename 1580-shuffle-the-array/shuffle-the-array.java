class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] ans=new int[2*n];
       int l=0;
       int r=n;
       int k=0;
       while(l<n&&r<2*n){
        ans[k++]=nums[l++];
        ans[k++]=nums[r++];
       }
return ans;

    }
}