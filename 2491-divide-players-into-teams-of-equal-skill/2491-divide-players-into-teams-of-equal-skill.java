class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        Arrays.sort(skill);
        int smallest=skill[0];
        int largest=skill[n-1];
        int total=smallest+largest;
        int left=0;
        int right=n-1;
        long ans=0;
        while(left<right){
            if((skill[left]+skill[right])==total){
                int mul=skill[left]*skill[right];
                ans+=mul;
            }else{
                return -1;
            }
            left++;
            right--;
        }
        return ans;
    }
}