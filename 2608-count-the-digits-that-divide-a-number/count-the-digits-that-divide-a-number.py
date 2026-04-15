class Solution:
    def countDigits(self, num: int) -> int:
        n=num
        c=0
        while(n>0):
            t=n%10
            if(num%t==0):
                c+=1
            n=n//10
        return c            