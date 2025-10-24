package Distictactoe;

public class disgamefunc {
        public boolean moremovesleft(board newboard){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (newboard[i][j] == ' '){
                    return true;
                }
            }
        }
        return false;
    }
    //clear board
    //player wins
    //player tie
    
}
