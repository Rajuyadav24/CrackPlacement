class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] res =  new int[m][n];
        int[][] directions = {{-1,-1},{-1,0},{0,-1},{0,1},{1,0},{1,-1},{-1,1},{1,1}};

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                for(int[] dir : directions){
                    int p = i + dir[0];
                    int q = j + dir[1];

                    if(p >= 0 && p < m && q >= 0 && q < n && board[p][q] == 1){
                        count++;
                    }
                }
                if(board[i][j] == 1){
                    if(count == 2 || count == 3){
                        res[i][j]  = 1;
                    }
                }
                else{
                    if(count == 3){
                        res[i][j] = 1;
                    }
                }   
                
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = res[i][j];
            }
        }

    }
}
