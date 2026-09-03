import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    //    Brute force
       
        // int n=0;
        // while(n<nums.length){
        //     pq.add(nums[n]);
        //     n++;
        // }
        // while(k!=1){
        //     pq.poll();
        //     k--;
        // }
        // int p=pq.peek();
        // return p;

        // optimal
       PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();

        
    }
}