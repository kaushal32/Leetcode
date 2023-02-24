class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m) return false;
        if(s.equals(t)) return true;

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for(int i=0; i<n; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m1.getOrDefault(c1, c2)!=c2 || m2.getOrDefault(c2, c1)!=c1) return false;
            else{
                m1.put(c1,c2);
                m2.put(c2,c1);
            }

        }
        return true;
    }
}
