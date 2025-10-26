package tictactoe;

public class Board {
    protected char[][] board;
    



    public Board(int rows, int cols) {
        board = new char[rows][cols];
    }

    public char getvalue(int row, int col){
        return board[row][col];
    }

    public void setvalue(int row, int col, char val) {
        board[row][col] = val;
    }


 

    public boolean playerwins(){
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == 
                board[i][2] && board[i][2]== 'X'){
                    return true;
                }
            else if(board[0][i] == board[1][i] && board[1][i] == 
                board[2][i] && board[2][i]== 'X'){
                    return true;
                }
        }
        if (board[0][0] == board[1][1] && board[1][1] == 
            board[2][2] && board[2][2]== 'X'){
                return true;
            }
        else if (board[0][2] == board[1][1] && board[1][1] == 
                board[2][0] && board[2][0]== 'X'){
                    return true;
                }
        return false;
    }

       public boolean compwins(){
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == 
                board[i][2] && board[i][2]== 'O'){
                    return true;
                }
            else if(board[0][i] == board[1][i] && board[1][i] == 
                board[2][i] && board[2][i]== 'O'){
                    return true;
                }
        }
        if (board[0][0] == board[1][1] && board[1][1] == 
            board[2][2] && board[2][2]== 'O'){
                return true;
            }
        else if (board[0][2] == board[1][1] && board[1][1] == 
                board[2][0] && board[2][0]== 'O'){
                    return true;
                }
        return false;
    }

    public boolean moremovesleft(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (getvalue(i,j) == ' '){
                    return true;
                }
            }
        }
        return false;
    }

    public void setboard(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = ' ';
    }
}
    }

    public String toString(){
       StringBuilder ret = new StringBuilder();
       ret.append(" ");
       for(int v = 0; v < 3; v++){
            ret.append(" ");
            ret.append(v);
            ret.append(" ");
            ret.append(" ");  
       }
       ret.append('\n');
       for (int i = 0; i < board.length; i++){
        ret.append(i);
            for (int j = 0; j < board[0].length; j++){
                 if (board[i][j] == 'X'){
                    ret.append(' ');
                    ret.append('X');
                    ret.append(' ');
                }
                else if (board[i][j] == 'O'){
                    ret.append(' ');
                    ret.append('O');
                    ret.append(' ');
                }
                else{
                    ret.append(' ');
                    ret.append(' ');
                    ret.append(' ');
                }
                if (j < 2){
                    ret.append('|');
                }
                if (j == 2) {
                    ret.append('\n');
                }
            }
         if (i < 2){
                ret.append(' ');
                ret.append("-----------");
                ret.append('\n');
            }
        } 
       return ret.toString();
     }
    

   
}
        