class Solution {
public double average(int[] salary) {
    int len=salary.length;
    if(len==0){
        return 0.0;
    }
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    double sum=0.0;

    for(int i=0;i<len;i++){
        max = Math.max(max,salary[i]);
        min = Math.min(min,salary[i]);
        sum+=salary[i];
    }

    sum = (sum - max - min)/(len-2);
    return sum;
}
}
