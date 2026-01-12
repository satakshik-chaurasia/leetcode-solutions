class Solution {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE;
        long sec=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int x:nums){
            if(x==first|| x==sec||x==third)
            continue;
            if(x>first){
                third=sec;
                sec=first;
                first=x;
            }
            else if(x>sec){
                third=sec;
                sec=x;

            }
            else if(x>third){
                third=x;
            }
        }
        if(third==Long.MIN_VALUE) return(int)first;
        return(int)third;
    }
}