package tictactoe;
import java.awt.Color;


public class O implements piece{
    private Color color;
    private int level;
    private int row;
    private int col;
    private static int value = 2;
    

    public O(int Orow, int Ocol){
    color = Color.black;
    level = 0;
    row = Orow;
    col = Ocol;
}

public int getlevel(){
    return level;
}

public Color getcolor(){
    return color;
}

public void inclevel(){
    level++;
}

public void setcolor (Color newcolor) {
    color = newcolor;
}

public int getrow(){
    return row;
}

public int getcol() {
    return col;
}

public void setrow(int newrow){
    row = newrow;
}

public void setcol(int newcol) {
    col = newcol;
}
    
}
