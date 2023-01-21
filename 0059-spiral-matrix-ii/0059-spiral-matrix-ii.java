class Solution {
    public int[][] generateMatrix(int n) {
        int left=0, right=n, top=0, bottom=n, count=1;
        int[][] ans = new int[n][n];
        while (left < right && top < bottom) {
            for (int i=left ; i<right ; i++) ans[top][i] = count++;
            top++;
            for (int i=top ; i<bottom ; i++) ans[i][right-1] = count++;
            right--;
            if (left < right) {
                for (int i=right-1 ; i>=left ; i--) ans[bottom-1][i] = count++;
                bottom--;
            }
            if (top < bottom) {
                for (int i=bottom-1 ; i>=top ; i--) ans[i][left] = count++;
                left++;
            }
        }
        return ans;
    }
}