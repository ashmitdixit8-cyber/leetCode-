class Solution {
    public String removeDuplicates(String s) {
        int i=0;
        Stack<Character > st= new Stack<>();
        int n=s.length();
        for(i=0;i<n;i++){
            char ch= s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch) st.pop();
            else st.push(ch);
        }
        StringBuilder res= new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}