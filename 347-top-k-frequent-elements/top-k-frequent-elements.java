class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap: [number, frequency]
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // Put elements in heap
        for(int num : map.keySet()) {

            pq.add(new int[]{num, map.get(num)});

            if(pq.size() > k) {
                pq.poll();
            }
        }

        // Answer
        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll()[0];
        }

        return ans;
    }
}