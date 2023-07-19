//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
  public:
    int solve(int i,int j,string a1,string a2,vector<vector<int>> &dp)
    {
        if(i<0 || j<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(a1[i]==a2[j])
        {
            dp[i][j]=1+solve(i-1,j-1,a1,a2,dp);
        }
         dp[i][j]=max(solve(i-1,j,a1,a2,dp),solve(i,j-1,a1,a2,dp));
    }
    int longestPalinSubseq(string A) {
        int n=A.size();
        string A1=A;
        reverse(A.begin(),A.end());
        string A2=A;
        //code here
        vector<vector<int>> dp(n+1,vector<int>(n+1,0));
        int m=n;
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(A1[i-1]==A2[j-1])
                {
                 dp[i][j]=1+dp[i-1][j-1];
                }
                else
                dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
        
    }
};

//{ Driver Code Starts.

int32_t main()
{
    int t; cin >> t;
    while (t--)
    {
        string s; cin >> s;
        Solution ob;
        cout << ob.longestPalinSubseq(s) << endl;
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends