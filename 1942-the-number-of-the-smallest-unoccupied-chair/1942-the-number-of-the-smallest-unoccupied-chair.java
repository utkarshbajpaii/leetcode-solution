class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n=times.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        int timeOfArrival=times[targetFriend][0];
        Arrays.sort(times,(a,b)->Integer.compare(a[0],b[0]));
        int chairNo=0;
        for(int i=0;i<n;i++){
            int arrival=times[i][0];
            int departure=times[i][1];
            while(!pq.isEmpty()&&pq.peek()[0]<=arrival){
                pq1.offer(pq.poll()[1]);
            }
            if(pq1.isEmpty()){
                pq.offer(new int[]{departure,chairNo});
                if(arrival==timeOfArrival){
                    return chairNo;
                }
                chairNo++;
            }else{
                int leastChairAvailable=pq1.poll();
                if(arrival==timeOfArrival){
                    return leastChairAvailable;
                }
                pq.offer(new int[]{departure, leastChairAvailable});
            }
        }
        return -1;
    }
}