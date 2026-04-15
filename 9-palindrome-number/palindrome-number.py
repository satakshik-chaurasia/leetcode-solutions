class Solution:
    def isPalindrome(self, x: int) -> bool:
        n=x
        rev=0
        if(x<0):
            return False
        while(n>0):
            d=n%10
            rev=rev*10+d
            n=n//10
        if(rev==x):
            return True
        else:
            return False        