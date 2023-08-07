#User function Template for python3

class Solution:
    def is_valid(self, board, row, col, num):
        # Check row and column
        for x in range(0, 9):
            if board[row][x] == num or board[x][col] == num:
                return False
            
        # Check 3x3 square to which the row and column belong to
        x = (row//3)*3
        y = (col//3)*3

        for i in range(3):
            for j in range(3):
                if board[x+i][y+j] == num:
                    return False

        return True
    
    #Function to find a solved Sudoku. 
    def SolveSudoku(self, grid):
        return self.solver(grid, 0, 0)

     #Function to print grids of the Sudoku.    
    def printGrid(self,arr):
        res = ""
        for i in range(9):
            for j in range(9):
                res = res + str(arr[i][j]) + " "
        print(res, end='')

    def solver(self, grid, i, j):
        if j >= 9:
            # Done with the current row, move onto next
            j = 0
            i += 1

        if i >= 9:
            # Done with all rows
            return True
        
        if grid[i][j] == 0:
            for num in range(1, 10):
                # Try out all number from 1-9 and see if the board can be solved
                if self.is_valid(grid, i, j, num):
                    grid[i][j] = num
                    if self.solver(grid, i, j+1):
                        return True
                    grid[i][j] = 0
        else:
            return self.solver(grid, i, j+1)


        return False

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    t = int(input())
    while(t>0):
        grid = [[0 for i in range(9)] for j in range(9)]
        row = [int(x) for x in input().strip().split()]
        k = 0
        for i in range(9):
            for j in range(9):
                grid[i][j] = row[k]
                k+=1
                
        ob = Solution()
            
        if(ob.SolveSudoku(grid)==True):
            ob.printGrid(grid)
            print()
        else:
            print("No solution exists")
        t = t-1
# } Driver Code Ends