class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length();
        int i = 0;
        int j=n-1;
        int count=0;
        int count2=0;
        while(i<j){
            int c=s.charAt(i);
            int c2=s.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
            if(c2=='a' || c2=='e' || c2=='i' ||c2=='o' || c2=='u'){
                count2++;
            }
            i++;
            j--;
        }
        if(count==count2){
            return true;
        }
        return false;

    }
}