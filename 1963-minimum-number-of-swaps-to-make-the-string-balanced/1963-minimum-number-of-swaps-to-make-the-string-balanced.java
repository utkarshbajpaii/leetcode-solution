class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        int unbalanced=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    unbalanced++;
                }
            }
        }    
        return (unbalanced+1)/2;
    }
}