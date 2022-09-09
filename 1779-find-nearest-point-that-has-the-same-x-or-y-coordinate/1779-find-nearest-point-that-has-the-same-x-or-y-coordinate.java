class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int minIndex = points.length;
        for(int i=0; i<points.length ; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            
            if(x == x1 || y == y1){
                int temp = Math.abs(x-x1) + Math.abs(y-y1);
                if(temp >= minDist){
                    continue;
                }
                else if(minDist > temp){
                    minDist = temp;
                    minIndex = i;
                }
            }
        }
        return minIndex == points.length ? -1 : minIndex;
    }
}