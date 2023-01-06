class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int sum = 0;
        for(int x : costs){
            if(sum<=coins){
                sum+=x;
                pq.add(x);
            }else if(pq.peek()>x){
                sum = sum - pq.poll() + x;
                pq.add(x);
            }
        }
        while(sum>coins){
            sum-=pq.poll();
        }
        return pq.size();
    }
}