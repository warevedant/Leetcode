class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int maxcount=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else count = 1;
            if(count>maxcount){
                maxcount=count;
            }
        }
        return maxcount;
    }
}