class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff = sum - target;

                    if(Math.abs(diff) < Math.abs(minDiff)) minDiff = diff;
                }
            }
        }

        return target + minDiff;
    }
}