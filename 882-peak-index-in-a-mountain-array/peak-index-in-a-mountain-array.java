class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int i=0;
        // int j=i+1;
        // while(arr[i]<arr[j]){
        //     i++;
        //     j++;
        // }
        // return i;
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
                ans=mid;
            }
        }
        return ans;
}}