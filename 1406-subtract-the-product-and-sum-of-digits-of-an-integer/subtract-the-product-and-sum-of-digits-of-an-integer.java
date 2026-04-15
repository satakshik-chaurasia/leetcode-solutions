class Solution {
    public int subtractProductAndSum(int n) {
        int m=n;
        int mul=1;
        int s=n;
        int sum=0;
        while(m>0){
            int d=m%10;
            mul=mul*d;
            m=m/10;
        }
        while(s>0){
            int t=s%10;
            sum=sum+t;
            s=s/10;
        }
        return mul-sum;
    }
}