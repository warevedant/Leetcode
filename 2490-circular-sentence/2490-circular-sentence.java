class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        int n=arr.length;
        for(int i=0;i<n;i++){
            int endchar=arr[i].charAt(arr[i].length()-1);
            int startchar=arr[(i+1)%n].charAt(0);

            if(startchar!=endchar) return false;
        }
        return true;
    }
}