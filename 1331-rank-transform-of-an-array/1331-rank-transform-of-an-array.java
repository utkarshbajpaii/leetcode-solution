class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] sorted=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        int r=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<sorted.length;i++){
            if(i>0&&sorted[i]>sorted[i-1]){
                r++;
            }
            map.put(sorted[i],r);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}