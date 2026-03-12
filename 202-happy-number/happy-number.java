class Solution {
    public static int happy(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=happy(slow);
            fast=happy(fast);
            fast=happy(fast);
            while(fast==slow&&slow!=1){
                return false;
            }
        }
        fast=1;
        return true;
    }
}