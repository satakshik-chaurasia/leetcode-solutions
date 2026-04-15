class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int r=0;
        if(x<0){
            return false;
        }
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
       if(r==x){
        return true;
       } 
      else{
        return false;
      }
    }
}