package tictactoe;
import java.util.Scanner;
import java.util.Random;


public class Gamemain{
    public static void main(String[] args){
        Board ticboard = new Board(3,3);
        ticboard.setboard();
        int turn = 0;
        System.out.println(ticboard);
        while ((!ticboard.playerwins()) && (!ticboard.compwins() && ticboard.moremovesleft())){
            if (turn == 0){
            Scanner scan = new Scanner(System.in); 
            System.out.println("Pick your spot (row) (col):");
            String[] input = scan.nextLine().split(" ");
            int input1 = Integer.parseInt(input[0]);
            int input2 = Integer.parseInt(input[1]);
            while (input.length != 2 || input1 > 2 || input1
             < 0 || input2 > 2 || input2 < 0 ||
             ticboard.getvalue(input1,input2) != ' '){
                System.out.println("Invalid input");
                System.out.println("Pick your spot (row) (col):");
                input = scan.nextLine().split(" ");
                input1 = Integer.parseInt(input[0]);
                input2 = Integer.parseInt(input[1]);
            }
            ticboard.setvalue(input1,input2,'X');
            System.out.println(ticboard);
            turn = 1;
        }
        else {
            Random rand = new Random();
            int Crow = rand.nextInt(3);
            int Ccol = rand.nextInt(3);
            while (ticboard.getvalue(Crow, Ccol) != ' '){
                Crow = rand.nextInt(3);
                Ccol = rand.nextInt(3);
            }
            ticboard.setvalue(Crow, Ccol, 'O');
            System.out.println(ticboard);
            turn = 0;
        }
        }
              if(ticboard.playerwins()){
            System.out.println("Player Wins!");
        }
        else if (ticboard.compwins()){
            System.out.println("Computer Wins!");
        }
        else{
            System.out.println("Its a draw!");
        }
    }
}