package tictactoe;

public class board {
    private char[][] board;

    public board() {
        board = new char[][]{{' ',' ',' '},{' ',' ',' ' },{' ',' ',' '}};;
    }

    public void clearboard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
    }
}
    }

    public void printboard(char[][] newboard, int val, int trow, int tcol){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == board[trow][tcol]){
                    if (val == 2){
                        System.out.print('O');
                    }
                    else{
                        System.out.print('X');
                    }
                }
                else if (board[i][j] == 'X'){
                    System.out.print('X');
                }
                else if (board[i][j] == 'O'){
                    System.out.print('O');
                }
                else{
                    System.out.print(' ');
                }
                if (j < 2){
                    System.out.print('|');
                }
                if (j == 2) {
                    System.out.print('\n');
                }
            }
            if (i < 2){
                System.out.println("_______");
            }
        }
    }

   
    
}
