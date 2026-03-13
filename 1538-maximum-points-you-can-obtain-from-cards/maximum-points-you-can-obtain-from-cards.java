class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int l=0;
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        int r=n-1;
        l=k-1;
        while(l>=0){
            sum-=arr[l];
            sum+=arr[r];
            l--;
            r--;
            max=Math.max(max,sum);
        }
        return max;
    }
}