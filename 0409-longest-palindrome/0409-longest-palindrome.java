class Solution {
   public int longestPalindrome(String s) {
        int hash[] = new int[256];
        for(int i = 0;i < s.length();i++){
            hash[s.charAt(i)]++;
        }
        int c_e = 0;
        int c_o = 0;
        for(var f:hash){
            if(f != 0){
                if(f % 2 == 0) c_e += f;
                else{
                    c_e += f - 1;
                    c_o++;
                }
            }
        }
        return c_e + (c_o > 0 ? 1 : 0);
    }
}