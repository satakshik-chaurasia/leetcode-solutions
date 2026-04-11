class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int [] res=new int[m+n];
      int i=0;
      int l=0;
      int r=0;
      while(l<m&&r<n){
        if(nums1[l]<nums2[r]){
            res[i++]=nums1[l];
            l++;
        }
       else {
            res[i++]=nums2[r];
            r++;
        }}
        while(r<n){
            res[i++]=nums2[r++];
        }
        while(l<m){
            res[i++]=nums1[l++];
        }
      
      for (int j = 0; j < m + n; j++) {
            nums1[j] = res[j];
        }
    }
}