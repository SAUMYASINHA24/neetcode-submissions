class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0;i<9;i++)
        {
            Set<Character> rowSet = new HashSet<>();
            for(int j =0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!rowSet.add(board[i][j]))
                        return false;                  
                }
            }
        }

        for(int j = 0;j<9;j++)
        {
            Set<Character> columnSet = new HashSet<>();
            for(int i =0;i<9;i++)
            {
                if(board[i][j]!='.')
                {
                    if(!columnSet.add(board[i][j]))
                        return false;                   
                }
            }
        }

        for(int boxRow = 0;boxRow<9;boxRow+=3)
        {
            for(int boxColumn =0;boxColumn<9;boxColumn+=3)
            {
                Set<Character> boxSet = new HashSet<>();
                for(int i = boxRow;i<boxRow+3;i++)
                {
                    for(int j = boxColumn;j<boxColumn+3;j++)
                    {
                        if(board[i][j]!='.')
                        {
                            if(!boxSet.add(board[i][j]))
                                return false;                   
                        }
                    }
                }   
            }  
        }
        return true;
    }
}
