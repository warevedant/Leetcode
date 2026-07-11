class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a=new char[128];
        char[] b=new char[128];
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(a[schar]=='\0'){
                if(b[tchar]!='\0') return false;
                a[schar]=tchar;
                b[tchar]=schar;
            }
            else if(a[schar]!=tchar) return false;
        }
        return true;
    }
}