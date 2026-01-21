class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
           int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x:map.keySet()){
            if(map.get(x)>n/3){
                result.add(x);
            }
        }
        return result;
    }
}