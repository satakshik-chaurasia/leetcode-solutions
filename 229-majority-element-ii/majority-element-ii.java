class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0;
        int c1=0;
        int c2=0;
        int count2=0;
        List<Integer> result=new ArrayList<>();
       for(int i=0;i<n;i++){
        int num=nums[i];
       
       if(count1==0&&num!=c2){
        c1=num;
        count1=1;
       }
       else if(count2==0&&num!=c1){
        c2=num;
        count2=1;
       }
       else if(num==c1){
        count1++;
       }
       else if(num==c2){
        count2++;
       }
       else{
        count1--;
        count2--;
       }}
       count1 = 0;
        count2 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == c1) count1++;
            else if(nums[i] == c2) count2++;
        }

        // Phase-3 (check > n/3)
        if(count1 > n/3) result.add(c1);
        if(count2 > n/3) result.add(c2);

        return result;
       
        
    }}