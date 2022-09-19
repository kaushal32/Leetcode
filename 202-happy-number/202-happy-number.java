class Solution {
    public boolean isHappy(int n) {
        if(n< 7 && n > 1) return false;
        if(n==1 ) return true;
        int result = 0;
     
        while(n!= 0 ){
            int m = n%10;
            result += m*m;
            n=n/10;
        
        }
        return isHappy(result) ;
        }
}