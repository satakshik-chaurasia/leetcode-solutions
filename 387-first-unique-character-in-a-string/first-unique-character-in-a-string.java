class Solution {
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
       int n=s.length();
       for(int i=0;i<n;i++){
        boolean u=true;
        for(int j=0;j<n;j++){
            if(i!=j&&arr[i]==arr[j]){
                u=false;
                break;
            }
        }
        if(u) return i;
       }
       return -1;
    }
}