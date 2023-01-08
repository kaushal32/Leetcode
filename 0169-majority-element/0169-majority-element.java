class Solution {
    public int majorityElement(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int count =0;
        int k=0;
        int max =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                if(count >max){
                    max=count;
                    k = arr[i];
                }
            }else{
                count =0;
            }
        }
        return k;
    }
}