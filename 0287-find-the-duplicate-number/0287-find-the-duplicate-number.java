class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        boolean[] arr=new boolean[n];
        for(int i=0;i<n;i++){
            int temp=nums[i];
            if(!arr[temp]){
                arr[temp]=true;
            }
            else{
                return temp;
            }
        }
        return 0;
    }
}