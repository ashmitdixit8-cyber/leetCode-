class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->{
                int z=Math.abs(a-x);
                int y=Math.abs(b-x);
                
                if(y!=z) return y-z;
                return b-a;

            }
        );
        for(int p:arr){
            pq.add(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
        
    }
}