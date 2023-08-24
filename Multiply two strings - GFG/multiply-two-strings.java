//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
       int n = s1.length();
        int m = s2.length();
        
        boolean f = false;
        if(s1.charAt(0) == '-') {
            s1 = s1.substring(1,n);
            f = !f;
        }
        if(s2.charAt(0) == '-') {
            s2 = s2.substring(1,m);
            f = !f;
        }
        
        
         n = s1.length();
         m = s2.length();
        int size = n+m;
        int arr[] = new int[size];
        
        int k = size-1;
        
        for(int i=n-1;i>=0;i--) {
            int d1 = s1.charAt(i) - '0';
            int c1=0;
            int c2=0;
            int ind = k; 
            for(int j=m-1;j>=0;j--) {
                
                int d2 = s2.charAt(j) - '0';
                int multi = d1 * d2;
                multi += c1;
                c1 = multi/10;
                int num = multi % 10;
                
                int value = arr[ind]+num+c2;
                c2 = value/10;
                arr[ind]=value%10;
                ind--;
            }
            
            arr[ind] = c1+c2;
            k--;
        }
        String str = "";
        int i = 0;
        while(i < size) {
            if(arr[i] != 0)
              break;
            i++;
        }
        
        while(i < size) {
            str += arr[i];
            i++;
        }
        if(f)
          str = '-'+str;
        
        return str;
        
    }
}

