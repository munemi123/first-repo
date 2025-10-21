package tictactoe;
import java.awt.Color;

public interface piece {
    public static final Color color = null;
    public static final int level = 0;
    public static final int row = 0;
    public static final int col = 0;
    public static final int value = 0;

public int getlevel();

public Color getcolor();

public void inclevel();

public void setcolor (Color newcolor);

public int getrow();

public int getcol();

public void setrow(int newrow);

public void setcol(int newcol);

}
