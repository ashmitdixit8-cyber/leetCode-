class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int l=-1;
        int r=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                l=mid;
                high=mid-1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high = mid-1;
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(nums[middle]==target){
                r=middle;
                low=middle+1;
            }
            else if(nums[middle]<target) low=middle+1;
            else high = middle-1;
        }
        return new int[]{l,r};
    }
}