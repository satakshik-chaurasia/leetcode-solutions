class Solution {
    public int findDuplicate(int[] nums) {
        int l=0;
        int r=0;
while(true){
    l=nums[l];
    r=nums[r];
    r=nums[r];
    if(l==r){
        l=0;
        while(l!=r){
            l=nums[l];
            r=nums[r];
        }
        return l;
    }

}
// return -1;
    }
}