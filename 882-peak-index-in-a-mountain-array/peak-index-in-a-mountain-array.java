class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=i+1;
        while(arr[i]<arr[j]){
            i++;
            j++;
        }
        return i;
        
    }
}