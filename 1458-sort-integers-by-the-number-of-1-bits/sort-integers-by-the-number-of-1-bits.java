import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        Integer[] temp = new Integer[arr.length];

        // convert to Integer array (needed for comparator)
        for(int i=0;i<arr.length;i++)
            temp[i]=arr[i];

        Arrays.sort(temp,(a,b)->{

            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if(bitsA == bitsB)
                return a-b;        // normal ascending
            else
                return bitsA-bitsB; // sort by set bits
        });

        // copy back to int array
        for(int i=0;i<arr.length;i++)
            arr[i]=temp[i];

        return arr;
    }
}