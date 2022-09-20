class Solution {
    public int[][] merge(int[][] intervals) {
      
        Arrays.sort(intervals, (x,y) ->Integer.compare(x[0],y[0]));
        ArrayList<int []> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int [] interval : intervals) {
          int previousInterval[] = list.get(list.size()-1);
          if(previousInterval[1] >= interval[0]) {
            previousInterval[1] = Math.max(previousInterval[1],interval[1]);
          }
          else {
            list.add(interval);
          }
        }
        return list.toArray(new int [list.size()][]);
    }
}