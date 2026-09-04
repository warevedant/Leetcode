class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int zerocount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount++;
            }
        }
        int count=0;
        int limit=n-zerocount;
        for(int i=0;i<limit;i++){
            if(nums[i]==0){
                count++;
            }
        }
        return count;
    }
}