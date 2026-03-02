class Solution {
    public String reverseWords(String s) {
     char[] arr=s.toCharArray();
     int start=0;
     for(int i=0;i<=arr.length;i++){
        if(i==arr.length||arr[i]==' '){
            int l=start;
            int r=i-1;
            while(l<r){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            start=i+1;
        }
     }
     return new String(arr);
    }
}