class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int count=0;
        int maxcount=0;
        int j=0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
                count--;
            }
            set.add(s.charAt(i));
            count++;

            if(count>maxcount){
                maxcount=count;
            }
        }
        
        return maxcount;
    }
}