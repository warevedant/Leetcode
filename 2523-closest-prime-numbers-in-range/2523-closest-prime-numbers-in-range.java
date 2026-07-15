class Solution {
    public boolean isprime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] arr2=new int[right-left+1];
        int[] arr={-1,-1};
        int index=0;
        for(int i=left;i<=right;i++){
            if(isprime(i)){
                arr2[index] = i;
                index++;
            }
        }
        if(index<2)return arr;
        int mindif=Integer.MAX_VALUE;
        for(int i=1;i<index;i++){
            int diff=arr2[i]-arr2[i-1];
            if(diff<mindif){
                mindif = diff;
                arr[0] = arr2[i - 1];
                arr[1] = arr2[i];
            }
        }

        return arr;
    }
}