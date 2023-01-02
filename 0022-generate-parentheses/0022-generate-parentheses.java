class Solution {
    
    private List<String> res = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
         rec(n,0,"");
        return res;
    }
	
    void rec(int rem, int closable, String cur){
        
        if(rem==0 && closable==0){
            res.add(cur);
            return;
        }
        
        if(rem>0)
            rec(rem-1, closable+1, cur+"(");
        
        if(closable>0)
            rec(rem,closable-1,cur+")");
    }
}