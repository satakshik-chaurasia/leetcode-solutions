class Solution {
    public int mySqrt(int x) {
        long r=x;
        if(x>=0||x<=Integer.MAX_VALUE){
         while(r*r>x){
            r=(r+(x/r))/2;
            }
        }
        else{
            return 0;
        }
        return (int)r;
    }
}
    