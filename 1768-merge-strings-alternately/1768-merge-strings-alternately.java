class Solution {
    public String mergeAlternately(String word1, String word2) {
        int x=0;
        int y=0;
        int n=word1.length()+word2.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==0 && x<word1.length()){
                sb.append(word1.charAt(x));
                x++;
            }else{
                if(y<word2.length()){
                    sb.append(word2.charAt(y));
                    y++;
                }
            }
        }
        while(x<word1.length()){
            sb.append(word1.charAt(x));
            x++;
        }
        while(y<word2.length()){
            sb.append(word2.charAt(y));
            y++;
        }
        return new String(sb);
    }
}