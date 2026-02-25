class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=1;
        while(l<n&&r<n){
            if(nums[l]%2==0){
                l+=2;
            }
            else if(nums[r]%2==1){
                 r+=2;
            }
            else{
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l+=2;
                r+=2;
            }
        }
        return nums;
            }
}