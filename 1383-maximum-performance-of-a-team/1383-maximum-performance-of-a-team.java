class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int se[][]=new int[n][2],i,j;
        long res=0,sum=0;
        for(i=0;i<n;i++){
            se[i][0]=speed[i];
            se[i][1]=efficiency[i];
        }
        Arrays.sort(se,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(i=0;i<n;i++){
            if(i>=k) sum-=pq.poll();
            pq.add(se[i][0]);
            sum+=se[i][0];
            res=Math.max(res,sum*se[i][1]);
        }
        return (int)(res%1000000007);
    }
}