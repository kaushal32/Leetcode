#User function Template for python3

class Solution:
    def maxOnes(self, a, n):
        mxglobal=0
        mxcur=0
        cnt=0
        for i in a:
            if i==0:
                mxcur+=1
                mxglobal=max(mxglobal,mxcur)
            else:
                mxcur-=1
                mxcur=max(mxcur,0)
                cnt+=1
        return mxglobal+cnt


#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob=Solution()
        print(ob.maxOnes(a, n))

        T -= 1


if __name__ == "__main__":
    main()



# } Driver Code Ends