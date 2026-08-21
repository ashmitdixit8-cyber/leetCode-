class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int res[]= new int[nums.length];
        int k=nums.length-1;
        int i=0;
        int j = nums.length-1;
        while(k>=0){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left<right){
                res[k]=right;
                j--;
            }
            else {
                res[k]=left;
                i++;
            }
            k--;

        }
        return res;
        // donee
    }
}