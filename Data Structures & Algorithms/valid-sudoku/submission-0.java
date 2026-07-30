class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<Character>[] cols = new HashSet[9];
         HashSet<Character>[] rows = new HashSet[9];
         HashSet<Character>[][] squares = new HashSet[9][9];

         for (int i = 0; i < 9; i++) {
            cols[i] = new HashSet<>();
            rows[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                squares[i][j] = new HashSet<>();

         for(int r = 0;r<9;r++)
            for(int c = 0;c<9;c++){
                char current = board[r][c];
                if(current=='.')
                    continue;
                if(rows[r].contains(current)
                || cols[c].contains(current)
                || squares[r/3][c/3].contains(current))
                    return false;
                rows[r].add(current);
                cols[c].add(current);
                squares[r/3][c/3].add(current);
            }
        return true;
    }
}
