class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        HashSet<Character>[][] map = new HashSet[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                map[i][j] = new HashSet<>();
            }
        }

        for(int i = 0; i < m; i++){
            HashSet<Character> row = new HashSet<>();

            for(int j = 0; j < n; j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                if(row.contains(ch)) return false;
                row.add(ch);
            }
        }

        for(int j = 0; j < n; j++){
            HashSet<Character> col = new HashSet<>();
            
            for(int i = 0; i < m; i++){
                char ch = board[i][j];
                if(ch == '.') continue;
                if(col.contains(ch)) return false;
                col.add(ch);
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                char ch = board[i][j];
                if(ch == '.') continue;

                if(map[i / 3][j / 3].contains(ch)) return false;
                map[i / 3][j / 3].add(ch);
            }
        }

        return true;
    }
}
