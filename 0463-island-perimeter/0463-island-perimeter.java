class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Check top
                    if (i == 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    // Check bottom
                    if (i == rows - 1 || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    // Check left
                    if (j == 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    // Check right
                    if (j == cols - 1 || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        
        return perimeter;
    }
}
