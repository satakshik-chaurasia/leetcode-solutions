class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int v:nums){
        map.put(v,map.getOrDefault(v,0)+1);
       } 
       for(int c:map.keySet()){
        if(map.get(c)>1){
            return true;
        }
       }
       return false;
    }
}