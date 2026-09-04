class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int i=k;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i+=k;
        }
    }
}