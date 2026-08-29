class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int sum=0;
        boolean odd=false;
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        for(int count:map.values()){
            if(count%2==0) sum+=count;
            else{
                sum=sum+count-1;
                odd=true;
            }

        }
        if(odd) sum++;
        return sum;

    }
}