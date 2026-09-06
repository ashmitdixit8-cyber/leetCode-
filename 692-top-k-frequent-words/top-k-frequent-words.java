class Pair{
    int i;
    String str;
    Pair( String s,int f){
        i=f;
        str=s;
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map= new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {

    if (a.i != b.i) {
        return a.i - b.i;
    }

    return b.str.compareTo(a.str);
});
        for(String s:map.keySet()){
            pq.add(new Pair(s,map.get(s)));
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(pq.poll().str);
        }
        Collections.reverse(list);
        return list;
        
    }
}