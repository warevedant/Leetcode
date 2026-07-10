class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(t);
        int n=s.length();
        int m=t.length();
        for(int i=0;i<sb1.length();i++){
                if(sb1.charAt(i)=='#'){
                    if(i>0){
                        sb1.deleteCharAt(i);
                        sb1.deleteCharAt(i-1);
                        i-=2;
                    }else{
                        sb1.deleteCharAt(i);
                        i--;
                    }
            }
        }
        for(int j=0;j<sb2.length();j++){
            if(sb2.charAt(j)=='#'){
                if(j>0){
                    sb2.deleteCharAt(j);
                    sb2.deleteCharAt(j-1);
                    j-=2;
                }else{
                    sb2.deleteCharAt(j);
                    j--;
                }
            }
        }
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}