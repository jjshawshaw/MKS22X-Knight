public class KnightBoard{
  private int[][] board;


  //@throws IllegalArgumentException when either parameter is <= 0.
  public KnightBoard(int startingRows,int startingCols){
      if (startingRows <= 0 || startingCols <= 0) throw new IllegalArgumentException();
      board = new int[startingRows][startingCols];
      clear();
  }

  public void clear(){
    for (int y = 0; y < board.length; y ++){
      for (int x = 0; x < board[0].length; x++){
        board[y][x] = 0;
      }
    }
  }

    /*blank boards display 0's as underscores
    you get a blank board if you never called solve or
    when there is no solution */

  public String toString(){
    String out = "";
    for (int y = 0; y < board.length; y ++){
      for (int x = 0; x < board[0].length; x++){
        if (board[y][x] == 0) out += "__ ";
        else if (board[y][x] < 10) out += "_" + board[y][x] + " ";
        else out += board[y][x] + " ";
      }
      out += "\n";
  }
  return out;
}

/*Modifies the board by labeling the moves from 1 (at startingRow,startingCol) up to the area of the board in proper knight move steps.
@throws IllegalStateException when the board contains non-zero values.
@throws IllegalArgumentException when either parameter is negative
 or out of bounds.
@returns true when the board is solvable from the specified starting position*/

public boolean solve(int startingRow, int startingCol){
  return solveH(startingRow, startingCol, 1);
}


// level is the # of the knight

private boolean addKnight(int row, int col, int level){
  if (row < 0 || col < 0 || row >= board.length || col  >= board[0].length) return false;
  else board[row][col] = level;
  return true;
}

private boolean solveH(int row ,int col, int level){
  if (level == (row * col)) return true;

  else {
    addKnight(row, col, level);
    int[] moves = new int[]{
      2, 1,
      2, -1,
      -2, 1,
      -2, -1,
      1, 2,
      1, -2,
      -1, 2,
      -1, -2
    };
     boolean nextMove = false;
     for (int i = 0; i < moves.length; i += 2){
       nextMove = nextMove || addKnight(row + moves[i], col + moves[i + 1], level + 1);
       System.out.println(toString());
     }
     if (!nextMove){
       board[row][col] = 0;
     }
     else{
       return true;
     }
    return false;
  }
}




/*@throws IllegalStateException when the board contains non-zero values.
@throws IllegalArgumentException when either parameter is negative
 or out of bounds.
@returns the number of solutions from the starting position specified*/

//public int countSolutions(int startingRow, int startingCol)






}
