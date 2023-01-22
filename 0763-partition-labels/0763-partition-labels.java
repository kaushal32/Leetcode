class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,i);
        }

        List<Integer> result = new ArrayList<Integer>();
        int size = 0, end = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            end = Math.max(end, map.get(c));
            size++;

            if(i==end){
                result.add(size);
                size=0;
            }
        }

        return result;
    }
}