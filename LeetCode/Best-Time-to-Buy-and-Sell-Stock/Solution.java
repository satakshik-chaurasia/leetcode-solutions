1class Solution {
2    public int maxProfit(int[] prices) {
3      int minprice=Integer.MAX_VALUE;
4      int maxprofit=0;
5      for(int i=0;i<prices.length;i++){
6        if(prices[i]<minprice){
7            minprice=prices[i];
8        }
9        int profit=prices[i]-minprice;
10        if(profit>maxprofit){
11            maxprofit=profit;
12        }
13      }  
14      return maxprofit;
15    }
16}