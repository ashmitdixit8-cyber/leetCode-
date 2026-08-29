class Solution {
    public boolean canConstruct(String ransomNote, String magzine) {
        HashMap< Character,Integer> r = new HashMap<>();
        HashMap< Character,Integer> m = new HashMap<>();
        for(char ch: ransomNote.toCharArray()){
            r.put(ch,r.getOrDefault(ch,0)+1);
        }
        for(char ch: magzine.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(!m.containsKey(ch)|| m.get(ch)<r.get(ch)) return false;
        }
        return true;

        
    }
}