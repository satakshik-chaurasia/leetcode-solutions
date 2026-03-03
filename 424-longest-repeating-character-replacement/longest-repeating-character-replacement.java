class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int [] freq=new int[26];
        int l=0;
        int maxlen=0;
        int maxfreq=0;
        for(int r=0;r<n;r++){
            int index=s.charAt(r)-'A';
             freq[index]++;
             maxfreq=Math.max(maxfreq,freq[index]);
             while((r-l+1)-maxfreq>k){
                freq[(s.charAt(l)-'A')]--;
                l++;
             }
             maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}