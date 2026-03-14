class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer>map1=new HashMap<>(); 
       HashMap<Integer,Integer>map2=new HashMap<>(); 
       for(int m:nums1){
        map1.put(m,map1.getOrDefault(m,0)+1);
       }
       for(int m1:nums2){
        map2.put(m1,map2.getOrDefault(m1,0)+1);
       }
       ArrayList<Integer> list=new ArrayList<>();
       for(int key:map1.keySet()){
        if(map2.containsKey(key)){
            list.add(key);
        }
       }int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
       
    }
}