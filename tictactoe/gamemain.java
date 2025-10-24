package tictactoe;
import java.util.Scanner;
import java.util.Random;

public class gamemain extends gamefunc{
    public static void main(String[] args){
        board ticboard = new board(3,3);
        while (moremovesleft(ticboard)){}
    }
}