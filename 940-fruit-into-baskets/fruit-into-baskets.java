class Solution {
    public int totalFruit(int[] arr) {
        int l=0;
        int n=arr.length;
        int r=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<n){
            int num=arr[r];
            map.put(num,map.getOrDefault(num,0)+1);
            while(map.size()>2){
                int lnum=arr[l];
                map.put(lnum,map.get(lnum)-1);
            
            if(map.get(lnum)==0){
                map.remove(lnum);
            }
             l++;
             }
                if(map.size()<=2){
            max=Math.max(max,r-l+1);
        }
             r++; 
        }
        // if(max==0){
        //     return 0;
        // }
        // if(max==1){
        //     return 1;
        // }
        // else
     return max;
     
    }
}