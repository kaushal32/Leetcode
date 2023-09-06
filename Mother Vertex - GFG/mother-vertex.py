
class Solution:
    def dfs(self, u, adj, visited):
        visited[u] = True
        for v in adj[u]:
            if not visited[v]:
                self.dfs(v, adj, visited)

    def findMotherVertex(self, V, adj):
        visited = [False] * V
        v = -1

        for i in range(V):
            if not visited[i]:
                self.dfs(i, adj, visited)
                v = i

        visited = [False] * V
        self.dfs(v, adj, visited)

        for it in visited:
            if not it:
                return -1

        return v


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys 

sys.setrecursionlimit(10**6) 
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		V, E = map(int, input().split())
		adj = [[] for i in range(V)]
		for _ in range(E):
			u, v = map(int, input().split())
			adj[u].append(v)
		obj = Solution()
		ans = obj.findMotherVertex(V, adj)
		print(ans)
# } Driver Code Ends