class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int two=0;
        int zero=0;
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]==0) zero++;
            else if (nums[i]==1) one++;
            else two++;
            i++;
        }
        while(zero!=0){ nums[j]=0;j++;zero--;}
        while(one!=0){ nums[j]=1;j++;one--;}
        while(two!=0){ nums[j]=2;j++;two--;}
        
    }
}