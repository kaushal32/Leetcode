class Solution {
  public int eraseOverlapIntervals(int[][] I) {
      
      int n = I.length;
      if(n<2) return 0;
      
      int min = I[0][1];
      int max = min;
      int minStart = I[0][0];
      for(int i=1; i<n; i++){
          max = Math.max(max, I[i][1]);
          min = Math.min(min, I[i][1]);
          minStart = Math.min(minStart, I[i][0]);
      }
      
      int shift = 1 - min;
      int[] iMap = new int[max - min + 2];
      for(int[] d:I){
          int left = d[0]+shift;
          int right = d[1]+shift;
          if(left>iMap[right]){
              iMap[right] = left;
          }
      }
    
      minStart = minStart + shift;      
      int notOverlap = 0;
      for(int i=1; i<iMap.length; i++){
          if(iMap[i]>=minStart){
              notOverlap++;
              minStart = i;
          }
      }
      
      return n - notOverlap;
  }
}