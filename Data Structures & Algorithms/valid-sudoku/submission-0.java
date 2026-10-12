class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0;i<9;i++)
        {
            Set<Character> rowSet = new HashSet<>();
            int counter =0;
            for(int j =0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    counter++;
                    if(!rowSet.add(board[i][j]))
                        return false;                  
                }
            }
            if(counter != rowSet.size())
                return false;
        }

        for(int j = 0;j<9;j++)
        {
            Set<Character> columnSet = new HashSet<>();
            int counter =0;
            for(int i =0;i<9;i++)
            {
                if(board[i][j]!='.')
                {
                    counter++;
                    if(!columnSet.add(board[i][j]))
                        return false;                   
                }
            }
            if(counter != columnSet.size())
                return false;
        }

        for(int boxRow = 0;boxRow<9;boxRow+=3)
        {
            for(int boxColumn =0;boxColumn<9;boxColumn+=3)
            {
                Set<Character> boxSet = new HashSet<>();
                int counter =0;
                for(int i = boxRow;i<boxRow+3;i++)
                {
                    for(int j = boxColumn;j<boxColumn+3;j++)
                    {
                        if(board[i][j]!='.')
                        {
                            counter++;
                            if(!boxSet.add(board[i][j]))
                                return false;                   
                        }
                    }
                }
                if(counter != boxSet.size())
                return false;
                
            }
            
        }

        return true;
    }
}
