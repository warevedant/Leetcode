class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxarea=0;
        while(l<r){
            int length=Math.min(height[l],height[r]);
            int width=r-l;
            int area=length*width;

            maxarea=(maxarea<area) ? area:maxarea;
            while(l<r && height[l]<=length) l++;
            while(l<r && height[r]<=length) r--;
        }
        return maxarea;
    }
}