class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            char[] ch1=sub.toCharArray();
            Arrays.sort(ch1);
            if(Arrays.equals(ch,ch1)){
                return true;
            }
        }
        return false;
    }
}
